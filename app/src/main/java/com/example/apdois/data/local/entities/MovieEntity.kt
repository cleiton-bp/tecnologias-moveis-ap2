package com.example.apdois.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MovieEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String = "",
    val genre: String = "",
    val director: String = "",
    val releaseYear: Int,
    val rating: Double,
    val isWatched: Boolean = false,
    val createdAt: String = System.currentTimeMillis().toString(),
    val addedBy: String = "Não informado",
    val imageUrl: String
)
