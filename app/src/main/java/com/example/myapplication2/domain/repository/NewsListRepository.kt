package com.example.myapplication2.domain.repository

import com.example.myapplication2.domain.model.request.NewsListRequestDomainModel
import com.example.myapplication2.domain.model.response.NewsHeadLinesDomainModel
import com.example.myapplication2.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsListRepository {
    suspend fun getNewsList(newsListRequestDomainModel: NewsListRequestDomainModel)
            : Flow<Resource<NewsHeadLinesDomainModel>>
}