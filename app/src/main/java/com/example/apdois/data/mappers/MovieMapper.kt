package com.example.apdois.data.mappers

import com.example.apdois.data.local.entities.MovieEntity
import com.example.apdois.data.model.Movie

fun Movie.convertToEntity() =
    MovieEntity(
        id = this.id,
        title = this.title,
        description = this.description,
        genre = this.genre,
        director = this.director,
        releaseYear = this.releaseYear,
        rating = this.rating,
        isWatched = this.watched,
        createdAt = this.createdAt,
        addedBy = this.addedBy,
        imageUrl = this.imageUrl
    )

fun MovieEntity.convertToModel() =
    Movie(
        id = this.id,
        title = this.title,
        description = this.description,
        genre = this.genre,
        director = this.director,
        releaseYear = this.releaseYear,
        rating = this.rating,
        watched = this.isWatched,
        createdAt = this.createdAt,
        addedBy = this.addedBy,
        imageUrl = this.imageUrl
    )