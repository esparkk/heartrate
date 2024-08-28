package com.example.passivedata;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/passivedata/RegisterForBackgroundDataWorker;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "healthServicesManager", "Lcom/example/passivedata/HealthServicesManager;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/example/passivedata/HealthServicesManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_debug"})
@androidx.hilt.work.HiltWorker()
public final class RegisterForBackgroundDataWorker extends androidx.work.Worker {
    @org.jetbrains.annotations.NotNull()
    private final com.example.passivedata.HealthServicesManager healthServicesManager = null;
    
    @dagger.assisted.AssistedInject()
    public RegisterForBackgroundDataWorker(@dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams, @org.jetbrains.annotations.NotNull()
    com.example.passivedata.HealthServicesManager healthServicesManager) {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
}