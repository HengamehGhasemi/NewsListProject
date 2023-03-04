package com.example.myapplication2.data.remote.responses

data class NewsHeadLines(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)