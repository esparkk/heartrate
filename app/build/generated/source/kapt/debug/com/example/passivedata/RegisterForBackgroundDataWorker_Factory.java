package com.example.passivedata;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class RegisterForBackgroundDataWorker_Factory {
  private final Provider<HealthServicesManager> healthServicesManagerProvider;

  public RegisterForBackgroundDataWorker_Factory(
      Provider<HealthServicesManager> healthServicesManagerProvider) {
    this.healthServicesManagerProvider = healthServicesManagerProvider;
  }

  public RegisterForBackgroundDataWorker get(Context appContext, WorkerParameters workerParams) {
    return newInstance(appContext, workerParams, healthServicesManagerProvider.get());
  }

  public static RegisterForBackgroundDataWorker_Factory create(
      Provider<HealthServicesManager> healthServicesManagerProvider) {
    return new RegisterForBackgroundDataWorker_Factory(healthServicesManagerProvider);
  }

  public static RegisterForBackgroundDataWorker newInstance(Context appContext,
      WorkerParameters workerParams, HealthServicesManager healthServicesManager) {
    return new RegisterForBackgroundDataWorker(appContext, workerParams, healthServicesManager);
  }
}
