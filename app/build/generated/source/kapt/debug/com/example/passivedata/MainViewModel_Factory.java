package com.example.passivedata;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<PassiveDataRepository> repositoryProvider;

  private final Provider<HealthServicesManager> healthServicesManagerProvider;

  public MainViewModel_Factory(Provider<PassiveDataRepository> repositoryProvider,
      Provider<HealthServicesManager> healthServicesManagerProvider) {
    this.repositoryProvider = repositoryProvider;
    this.healthServicesManagerProvider = healthServicesManagerProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get(), healthServicesManagerProvider.get());
  }

  public static MainViewModel_Factory create(Provider<PassiveDataRepository> repositoryProvider,
      Provider<HealthServicesManager> healthServicesManagerProvider) {
    return new MainViewModel_Factory(repositoryProvider, healthServicesManagerProvider);
  }

  public static MainViewModel newInstance(PassiveDataRepository repository,
      HealthServicesManager healthServicesManager) {
    return new MainViewModel(repository, healthServicesManager);
  }
}
