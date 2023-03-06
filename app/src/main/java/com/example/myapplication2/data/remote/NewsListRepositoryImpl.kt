package com.example.myapplication2.data.remote

import com.example.myapplication2.domain.model.request.NewsListRequestDomainModel
import com.example.myapplication2.domain.model.response.NewsHeadLinesDomainModel
import com.example.myapplication2.domain.repository.NewsListRepository
import com.example.myapplication2.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsListRepositoryImpl @Inject constructor(
    private val api: NewsApi
) : NewsListRepository {
    override suspend fun getNewsList(newsListRequestDomainModel: NewsListRequestDomainModel):
            Flow<Resource<NewsHeadLinesDomainModel>> = flow {
        try {
            val response = api.getNews(
                country = newsListRequestDomainModel.country,
                apiKey = newsListRequestDomainModel.apiKey,
                category = newsListRequestDomainModel.category,
                sources = newsListRequestDomainModel.sources,
                q = newsListRequestDomainModel.q,
                page = newsListRequestDomainModel.page,
                pageSize = newsListRequestDomainModel.pageSize
            )
            emit(
                Resource.Success(
                    response.toDomainModel()
                )
            )
        }catch (e : Exception) {
            emit(Resource.Error(e.message ?: ""))
        }
    }
}