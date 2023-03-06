package com.example.myapplication2.domain.model.response

import com.example.myapplication2.ui.model.response.SourceUIModel

data class SourceDomainModel(
    val id: String,
    val name: String
){
    fun toUIModel() : SourceUIModel {
        return SourceUIModel(
            id = id,
            name = name
        )
    }
}