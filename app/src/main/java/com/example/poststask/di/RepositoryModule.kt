package com.example.poststask.di

import com.example.poststask.data.local.PostDao
import com.example.poststask.data.remote.ApiService
import com.example.poststask.data.repo.Repository
import com.example.poststask.domain.repo.IRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {


    /**
     * Provides [Repository] instance
     */
    @Provides
    @Singleton
    fun provideRepository(apiService: ApiService, postDao: PostDao, @IoDispatcher dispatcher: CoroutineDispatcher): IRepository {
        return Repository(apiService,postDao,dispatcher)
    }
}