package com.example.myapplication2.data.remote.response

import com.example.myapplication2.domain.model.response.SourceDomainModel

data class SourceDataModel(
    val id: String,
    val name: String
){
    fun toDomainModel() : SourceDomainModel {
        return SourceDomainModel(
            id = id,
            name = name
        )
    }
}