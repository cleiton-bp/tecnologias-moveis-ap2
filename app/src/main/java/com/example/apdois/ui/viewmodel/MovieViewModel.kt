package com.example.apdois.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.apdois.data.MovieRepository
import com.example.apdois.data.model.Movie

class MovieViewModel : ViewModel() {
    private val repository = MovieRepository()

    private val _movieList = MutableLiveData<List<Movie>>()
    val movieList: LiveData<List<Movie>> = _movieList

    init {
        _movieList.value = repository.getMovies()
    }

    fun deleteMovie(movie: Movie) {
        val newList = repository.movieList.toMutableList()
        newList.remove(movie)

        _movieList.value = newList.toList()
    }
}