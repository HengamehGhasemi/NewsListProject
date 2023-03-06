package com.example.myapplication2.data.remote.response

import com.example.myapplication2.domain.model.response.NewsHeadLinesDomainModel

data class NewsHeadLinesDataModel(
    val article: List<ArticleDataModel>,
    val status: String,
    val totalResults: Int
) {
    fun toDomainModel(): NewsHeadLinesDomainModel {
        return NewsHeadLinesDomainModel(
            article = article.map { it.toDomainModel() },
            status = status,
            totalResults = totalResults
        )
    }
}