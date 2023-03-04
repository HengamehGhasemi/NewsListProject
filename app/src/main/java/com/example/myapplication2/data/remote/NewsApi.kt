package com.example.myapplication2.data.remote

import com.example.myapplication2.data.remote.responses.NewsHeadLines
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/top-headlines")
    suspend fun getNews(
        @Query("country") country : String?,
        @Query("apiKey") apiKey : String?,
        @Query("category") category : String?,
        @Query("sources") sources : String?,
        @Query("q") q : String?,
        @Query("pageSize") pageSize : Int?,
        @Query("page") page : Int?,
    ): NewsHeadLines
}