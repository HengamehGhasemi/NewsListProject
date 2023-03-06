package com.example.myapplication2.di

import com.example.myapplication2.domain.repository.NewsListRepository
import com.example.myapplication2.domain.usecase.NewsListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object DomainModule {
    @Provides
    @ViewModelScoped
    fun provideNewsListUseCase(
        newsListRepository: NewsListRepository
    ): NewsListUseCase {
        return NewsListUseCase(
            repository = newsListRepository,
        )
    }
}