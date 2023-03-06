package com.example.myapplication2.ui.newsList

import androidx.lifecycle.ViewModel
import com.example.myapplication2.domain.usecase.NewsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsListViewModel @Inject constructor(
    private val newsListUseCase: NewsListUseCase
) : ViewModel() {
}