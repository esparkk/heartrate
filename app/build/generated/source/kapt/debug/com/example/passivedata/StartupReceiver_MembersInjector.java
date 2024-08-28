package com.example.passivedata;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class StartupReceiver_MembersInjector implements MembersInjector<StartupReceiver> {
  private final Provider<PassiveDataRepository> repositoryProvider;

  public StartupReceiver_MembersInjector(Provider<PassiveDataRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<StartupReceiver> create(
      Provider<PassiveDataRepository> repositoryProvider) {
    return new StartupReceiver_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(StartupReceiver instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.example.passivedata.StartupReceiver.repository")
  public static void injectRepository(StartupReceiver instance, PassiveDataRepository repository) {
    instance.repository = repository;
  }
}
