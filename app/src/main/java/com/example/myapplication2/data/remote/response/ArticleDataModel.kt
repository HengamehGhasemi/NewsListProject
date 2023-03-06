package com.example.myapplication2.data.remote.response

import com.example.myapplication2.domain.model.response.ArticleDomainModel

data class ArticleDataModel(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: SourceDataModel,
    val title: String,
    val url: String,
    val urlToImage: String
){
    fun toDomainModel() : ArticleDomainModel {
        return ArticleDomainModel(
            author = author ,
                    content = content ,
                    description = description ,
                    publishedAt = publishedAt ,
                    source = source.toDomainModel(),
                    title = title ,
                    url = url ,
                    urlToImage = urlToImage ,
        )
    }
}