package com.example.myapplication2.domain.model.request

data class NewsListRequestDomainModel(
    val country : String? = null,
    val apiKey :String,
    val category : String? = null,
    val sources :String? = null,
    val q : String? = null,
    val pageSize :Int? = null,
    val page : Int? = null
)
