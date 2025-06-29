package com.example.apdois.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.apdois.data.MovieRepository
import com.example.apdois.data.local.MovieLocalDataSource
import com.example.apdois.data.model.Movie
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import com.example.apdois.data.local.database.AppDatabase

class MovieViewModel (application: Application) : AndroidViewModel(application) {
    // TODO está da pior forma até a próxima aula
    private val movieDao = AppDatabase.getInstance(application).movieDao()
    private val localDataSource = MovieLocalDataSource(movieDao)
    private val repository = MovieRepository(localDataSource)

    private val _movieList = repository.getAllMovies().asLiveData()
    val movieList: LiveData<List<Movie>> = _movieList

    init {
        repository.getAllMovies()
    }

    fun removeMovie(movie: Movie) = viewModelScope.launch(Dispatchers.IO) {
        repository.remove(movie)
    }

    fun addMovie(movie: Movie) = viewModelScope.launch(Dispatchers.IO) {
        repository.add(movie)
    }

    fun checkWatchedMovie(movieId: Int, isWatched: Boolean) = viewModelScope.launch(Dispatchers.IO) {
        repository.checkWatchedMovie(movieId, isWatched)
    }
}