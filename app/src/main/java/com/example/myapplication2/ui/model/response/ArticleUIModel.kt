package com.example.myapplication2.ui.model.response

data class ArticleUIModel(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: SourceUIModel,
    val title: String,
    val url: String,
    val urlToImage: String
)