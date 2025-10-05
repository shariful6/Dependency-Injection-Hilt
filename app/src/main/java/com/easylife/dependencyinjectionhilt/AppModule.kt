package com.easylife.dependencyinjectionhilt

import com.easylife.dependencyinjectionhilt.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideApiService(): ApiService = FakeApiService()

    @Provides
    fun provideUserRepository(apiService: ApiService): UserRepository = UserRepository(apiService)
}