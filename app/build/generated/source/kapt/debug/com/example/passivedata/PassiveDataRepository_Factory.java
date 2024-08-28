package com.example.passivedata;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
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
public final class PassiveDataRepository_Factory implements Factory<PassiveDataRepository> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public PassiveDataRepository_Factory(Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public PassiveDataRepository get() {
    return newInstance(dataStoreProvider.get());
  }

  public static PassiveDataRepository_Factory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new PassiveDataRepository_Factory(dataStoreProvider);
  }

  public static PassiveDataRepository newInstance(DataStore<Preferences> dataStore) {
    return new PassiveDataRepository(dataStore);
  }
}
