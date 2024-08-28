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
public final class PassiveDataService_MembersInjector implements MembersInjector<PassiveDataService> {
  private final Provider<PassiveDataRepository> repositoryProvider;

  public PassiveDataService_MembersInjector(Provider<PassiveDataRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PassiveDataService> create(
      Provider<PassiveDataRepository> repositoryProvider) {
    return new PassiveDataService_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PassiveDataService instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.example.passivedata.PassiveDataService.repository")
  public static void injectRepository(PassiveDataService instance,
      PassiveDataRepository repository) {
    instance.repository = repository;
  }
}
