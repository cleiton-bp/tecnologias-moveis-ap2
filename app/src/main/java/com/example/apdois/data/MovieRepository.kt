package com.example.apdois.data

import com.example.apdois.data.local.MovieLocalDataSource
import com.example.apdois.data.mappers.convertToEntity
import com.example.apdois.data.mappers.convertToModel
import com.example.apdois.data.model.Movie
import kotlinx.coroutines.flow.map

class MovieRepository(private val dataSource: MovieLocalDataSource) {
    fun getAllMovies() =
        dataSource.getAllMovies().map { entities -> entities.map { it.convertToModel() } }

    suspend fun remove(movie: Movie) = dataSource.deleteMovie(movie.convertToEntity())
    suspend fun add(movie: Movie) = dataSource.addMovie(movie.convertToEntity())
    suspend fun checkWatchedMovie(movieId: Int, isWatched: Boolean) = dataSource.checkWatchedMovie(movieId, isWatched)
}