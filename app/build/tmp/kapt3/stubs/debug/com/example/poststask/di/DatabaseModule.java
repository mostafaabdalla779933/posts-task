package com.example.poststask.di;

import java.lang.System;

/**
 * Module that holds database related classes
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/poststask/di/DatabaseModule;", "", "()V", "provideAppDatabase", "Lcom/example/poststask/data/local/AppDatabase;", "context", "Landroid/content/Context;", "providePostDAO", "Lcom/example/poststask/data/local/PostDao;", "appDatabase", "app_debug"})
@dagger.Module
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.poststask.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    /**
     * Provides [AppDatabase] instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.poststask.data.local.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    /**
     * Provides [PostDAO] instance
     */
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.poststask.data.local.PostDao providePostDAO(@org.jetbrains.annotations.NotNull
    com.example.poststask.data.local.AppDatabase appDatabase) {
        return null;
    }
}