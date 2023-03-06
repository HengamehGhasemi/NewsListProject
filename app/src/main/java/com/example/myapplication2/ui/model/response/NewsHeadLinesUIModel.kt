package com.example.myapplication2.ui.model.response

data class NewsHeadLinesUIModel(
    val article: List<ArticleUIModel>,
    val status: String,
    val totalResults: Int
)