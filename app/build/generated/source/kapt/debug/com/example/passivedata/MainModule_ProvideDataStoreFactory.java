package com.example.passivedata;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
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
public final class MainModule_ProvideDataStoreFactory implements Factory<DataStore<Preferences>> {
  private final MainModule module;

  private final Provider<Context> contextProvider;

  public MainModule_ProvideDataStoreFactory(MainModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStore<Preferences> get() {
    return provideDataStore(module, contextProvider.get());
  }

  public static MainModule_ProvideDataStoreFactory create(MainModule module,
      Provider<Context> contextProvider) {
    return new MainModule_ProvideDataStoreFactory(module, contextProvider);
  }

  public static DataStore<Preferences> provideDataStore(MainModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideDataStore(context));
  }
}
