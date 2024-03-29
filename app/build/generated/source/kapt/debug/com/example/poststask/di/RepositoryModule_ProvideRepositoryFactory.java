// Generated by Dagger (https://dagger.dev).
package com.example.poststask.di;

import com.example.poststask.data.local.PostDao;
import com.example.poststask.data.remote.ApiService;
import com.example.poststask.domain.repo.IRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.example.poststask.di.IoDispatcher")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideRepositoryFactory implements Factory<IRepository> {
  private final RepositoryModule module;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<PostDao> postDaoProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public RepositoryModule_ProvideRepositoryFactory(RepositoryModule module,
      Provider<ApiService> apiServiceProvider, Provider<PostDao> postDaoProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.module = module;
    this.apiServiceProvider = apiServiceProvider;
    this.postDaoProvider = postDaoProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public IRepository get() {
    return provideRepository(module, apiServiceProvider.get(), postDaoProvider.get(), dispatcherProvider.get());
  }

  public static RepositoryModule_ProvideRepositoryFactory create(RepositoryModule module,
      Provider<ApiService> apiServiceProvider, Provider<PostDao> postDaoProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new RepositoryModule_ProvideRepositoryFactory(module, apiServiceProvider, postDaoProvider, dispatcherProvider);
  }

  public static IRepository provideRepository(RepositoryModule instance, ApiService apiService,
      PostDao postDao, CoroutineDispatcher dispatcher) {
    return Preconditions.checkNotNullFromProvides(instance.provideRepository(apiService, postDao, dispatcher));
  }
}
