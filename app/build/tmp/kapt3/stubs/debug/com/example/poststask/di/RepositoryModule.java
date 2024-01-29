package com.example.poststask.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/poststask/di/RepositoryModule;", "", "()V", "provideRepository", "Lcom/example/poststask/domain/repo/IRepository;", "apiService", "Lcom/example/poststask/data/remote/ApiService;", "postDao", "Lcom/example/poststask/data/local/PostDao;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    /**
     * Provides [Repository] instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.poststask.domain.repo.IRepository provideRepository(@org.jetbrains.annotations.NotNull
    com.example.poststask.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.example.poststask.data.local.PostDao postDao, @org.jetbrains.annotations.NotNull
    @IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        return null;
    }
}