package com.example.apdois.data.local

import com.example.apdois.data.local.dao.MovieDao
import com.example.apdois.data.local.entities.MovieEntity
import kotlinx.coroutines.flow.Flow

class MovieLocalDataSource(private val movieDao: MovieDao) {
    fun getAllMovies(): Flow<List<MovieEntity>> = movieDao.getAllMovies()

    suspend fun addMovie(movie: MovieEntity) {
        movieDao.insert(movie)
    }

    suspend fun deleteMovie(movie: MovieEntity) {
        movieDao.delete(movie)
    }

    suspend fun checkWatchedMovie(movieId: Int, isWatched: Boolean) {
        movieDao.watchedMovie(movieId, !isWatched)
    }
}