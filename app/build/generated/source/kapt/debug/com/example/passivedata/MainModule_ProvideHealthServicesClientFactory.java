package com.example.passivedata;

import android.content.Context;
import androidx.health.services.client.HealthServicesClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class MainModule_ProvideHealthServicesClientFactory implements Factory<HealthServicesClient> {
  private final MainModule module;

  private final Provider<Context> contextProvider;

  public MainModule_ProvideHealthServicesClientFactory(MainModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public HealthServicesClient get() {
    return provideHealthServicesClient(module, contextProvider.get());
  }

  public static MainModule_ProvideHealthServicesClientFactory create(MainModule module,
      Provider<Context> contextProvider) {
    return new MainModule_ProvideHealthServicesClientFactory(module, contextProvider);
  }

  public static HealthServicesClient provideHealthServicesClient(MainModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideHealthServicesClient(context));
  }
}
