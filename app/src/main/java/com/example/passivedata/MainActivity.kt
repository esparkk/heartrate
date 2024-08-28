package com.example.passivedata

import android.os.Bundle
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import okhttp3.MediaType.Companion.toMediaType
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var sensorManager: SensorManager
    private var heartRateSensor: Sensor? = null
    private var heartRateListener: SensorEventListener? = null
    private val client = OkHttpClient()
    private var isSendingData = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initHeartRateSensor() // 센서 초기화
    }

    private fun initHeartRateSensor() {
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        heartRateSensor = sensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE)

        heartRateListener = object : SensorEventListener {
            override fun onSensorChanged(event: SensorEvent?) {
                if (isSendingData && event != null && event.values.isNotEmpty()) {
                    val currentHeartRate = event.values[0].toInt()
                    sendHeartRateData(currentHeartRate)
                }
            }

            override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
        }
    }

    override fun onResume() {
        super.onResume()
        heartRateSensor?.also { sensor ->
            sensorManager.registerListener(heartRateListener, sensor, SensorManager.SENSOR_DELAY_NORMAL)
            isSendingData = true // 데이터 전송 시작
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(heartRateListener)
        isSendingData = false // 데이터 전송 중지
    }

    private fun sendHeartRateData(currentHeartRate: Int) {
        val jsonData = """
        {
            "timestamp": "${System.currentTimeMillis()}",
            "currentHeartRate": $currentHeartRate
        }
        """

        val mediaType = "application/json".toMediaType()
        val body = RequestBody.create(mediaType, jsonData)

        val request = Request.Builder()
            .url("http://10.240.154.34:3000/api/heartrate") // 서버 URL 입력
            .post(body)
            .build()

        client.newCall(request).enqueue(object : okhttp3.Callback {
            override fun onFailure(call: okhttp3.Call, e: IOException) {
                Log.e("MainActivity", "전송 실패: ${e.message}")
            }

            override fun onResponse(call: okhttp3.Call, response: Response) {
                if (response.isSuccessful) {
                    Log.i("MainActivity", "전송 성공: ${response.body?.string()}")
                } else {
                    Log.e("MainActivity", "응답 실패: ${response.code}")
                }
            }
        })
    }
}
