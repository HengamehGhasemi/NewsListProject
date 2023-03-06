package com.example.myapplication2.domain.usecase

import com.example.myapplication2.domain.model.request.NewsListRequestDomainModel
import com.example.myapplication2.domain.model.response.NewsHeadLinesDomainModel
import com.example.myapplication2.domain.repository.NewsListRepository
import com.example.myapplication2.util.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsListUseCase @Inject constructor(
    private val repository: NewsListRepository
) {
    suspend operator fun invoke(newsListRequestDomainModel: NewsListRequestDomainModel)
            : Flow<Resource<NewsHeadLinesDomainModel>> {
        return repository.getNewsList(newsListRequestDomainModel)
    }
}