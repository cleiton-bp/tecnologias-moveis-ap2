package com.example.apdois.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.apdois.data.local.entities.MovieEntity
import kotlinx.coroutines.flow.Flow
@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: MovieEntity)

    @Query("SELECT * FROM movies")
    fun getAllMovies(): Flow<List<MovieEntity>>

    @Query("Update movies SET isWatched = :isWatched where id = :movieId")
    suspend fun watchedMovie(movieId: Int, isWatched: Boolean)

    @Delete
    suspend fun delete(user: MovieEntity)
}