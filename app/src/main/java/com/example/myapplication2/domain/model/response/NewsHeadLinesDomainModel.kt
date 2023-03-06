package com.example.myapplication2.domain.model.response

import com.example.myapplication2.ui.model.response.NewsHeadLinesUIModel

data class NewsHeadLinesDomainModel(
    val article: List<ArticleDomainModel>,
    val status: String,
    val totalResults: Int
){
    fun toUIModel() : NewsHeadLinesUIModel {
        return NewsHeadLinesUIModel(
            article = article.map { it.toUIModel() }.sortedBy { it.publishedAt }.toList(),
            status = status,
            totalResults = totalResults
        )
    }
}