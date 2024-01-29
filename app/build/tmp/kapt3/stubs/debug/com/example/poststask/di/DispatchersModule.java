package com.example.poststask.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/example/poststask/di/DispatchersModule;", "", "()V", "provideDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideDefaultDispatcher$app_debug", "provideIoDispatcher", "provideIoDispatcher$app_debug", "providesMainDispatcher", "providesMainDispatcher$app_debug", "app_debug"})
@dagger.Module
public final class DispatchersModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.poststask.di.DispatchersModule INSTANCE = null;
    
    private DispatchersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @DefaultDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @IoDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @MainDispatcher
    @dagger.Provides
    public final kotlinx.coroutines.CoroutineDispatcher providesMainDispatcher$app_debug() {
        return null;
    }
}