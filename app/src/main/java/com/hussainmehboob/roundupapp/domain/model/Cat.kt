package com.hussainmehboob.roundupapp.domain.model

data class Cat(
    val breeds: List<Breed>?,
    val id: String,
    val url: String
)

data class Breed(
    val id: String,
    val name: String,
    val temperament: String?,
    val description: String?,
    val wikipediaUrl: String?,
    val imageId: String?,
)