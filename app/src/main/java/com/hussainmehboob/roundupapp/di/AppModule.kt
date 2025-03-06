package com.hussainmehboob.roundupapp.di

import com.hussainmehboob.roundupapp.data.remote.CatApiService
import com.hussainmehboob.roundupapp.data.remote.RemoteDataSource
import com.hussainmehboob.roundupapp.data.repository.CatRepositoryImpl
import com.hussainmehboob.roundupapp.domain.repository.CatRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCatRepository(
        remoteDataSource: RemoteDataSource
    ): CatRepository {
        return CatRepositoryImpl(remoteDataSource)
    }

    @Provides
    @Singleton
    fun provideRemoteDataSource(
        catApiService: CatApiService
    ): RemoteDataSource {
        return RemoteDataSource(catApiService)
    }
}
