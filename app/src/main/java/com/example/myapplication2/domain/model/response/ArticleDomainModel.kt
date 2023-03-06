package com.example.myapplication2.domain.model.response

import com.example.myapplication2.ui.model.response.ArticleUIModel

data class ArticleDomainModel(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: SourceDomainModel,
    val title: String,
    val url: String,
    val urlToImage: String
) {
    fun toUIModel(): ArticleUIModel {
        return ArticleUIModel(
            author = author,
            content = content,
            description = description,
            publishedAt = publishedAt,
            source = source.toUIModel(),
            title = title,
            url = url,
            urlToImage = urlToImage,
        )
    }
}