package com.example.myapplication2.di

import com.example.myapplication2.BuildConfig
import com.example.myapplication2.data.remote.NewsApi
import com.example.myapplication2.data.remote.NewsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provide(api : NewsApi) = NewsRepositoryImpl(api)

    @Singleton
    @Provides
    fun provideNewsApi() :
            NewsApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.NEWS_URL)
            .build()
            .create(NewsApi::class.java)
    }
}