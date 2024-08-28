package com.example.passivedata;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class RegisterForBackgroundDataWorker_AssistedFactory_Impl implements RegisterForBackgroundDataWorker_AssistedFactory {
  private final RegisterForBackgroundDataWorker_Factory delegateFactory;

  RegisterForBackgroundDataWorker_AssistedFactory_Impl(
      RegisterForBackgroundDataWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public RegisterForBackgroundDataWorker create(Context arg0, WorkerParameters arg1) {
    return delegateFactory.get(arg0, arg1);
  }

  public static Provider<RegisterForBackgroundDataWorker_AssistedFactory> create(
      RegisterForBackgroundDataWorker_Factory delegateFactory) {
    return InstanceFactory.create(new RegisterForBackgroundDataWorker_AssistedFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<RegisterForBackgroundDataWorker_AssistedFactory> createFactoryProvider(
      RegisterForBackgroundDataWorker_Factory delegateFactory) {
    return InstanceFactory.create(new RegisterForBackgroundDataWorker_AssistedFactory_Impl(delegateFactory));
  }
}
