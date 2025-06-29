package com.example.apdois.data.model

import java.io.Serializable

data class Movie(
    val id: Int = 0,
    val title: String,
    val description: String,
    val genre: String,
    val director: String,
    val releaseYear: Int,
    val rating: Double,
    val watched: Boolean,
    val createdAt: String,
    val addedBy: String,
    val imageUrl: String
) : Serializable
