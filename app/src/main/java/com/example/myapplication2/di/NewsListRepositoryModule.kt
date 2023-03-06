package com.example.myapplication2.di

import com.example.myapplication2.data.remote.NewsListRepositoryImpl
import com.example.myapplication2.domain.repository.NewsListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class NewsListRepositoryModule {
    @Binds
    @ViewModelScoped
    abstract fun bindNewsListRepository(
        impl: NewsListRepositoryImpl
    ): NewsListRepository
}