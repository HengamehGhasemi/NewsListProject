package com.example.myapplication2.data.remote

import com.example.myapplication2.data.remote.responses.NewsHeadLines
import com.example.myapplication2.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class NewsRepositoryImpl @Inject constructor(
    private val api: NewsApi
){
    suspend fun getNewsHeadLines(
        country : String?,
        apiKey : String,
        category : String?,
        sources : String?,
        q : String?,
        page : Int?,
        pageSize : Int?
    ) : Resource<NewsHeadLines> {
        val response = try {
            api.getNews(
                country = country,
                apiKey = apiKey,
                category = category,
                sources = sources,
                q = q,
                page = page,
                pageSize = pageSize
            )
        }catch (e : Exception) {
            return Resource.Error("")
        }
        return Resource.Success(response)
    }
}