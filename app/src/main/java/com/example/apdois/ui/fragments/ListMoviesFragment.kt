package com.example.apdois.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.apdois.R
import com.example.apdois.data.MovieRepository
import com.example.apdois.data.model.Movie
import com.example.apdois.ui.adapter.MovieAdapter
import com.google.android.material.snackbar.Snackbar

class ListMoviesFragment : Fragment() {
    private val repository = MovieRepository()
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        adapter = MovieAdapter(
            onDelete = { movie ->
                deleteMovie(view = view, recyclerView = recyclerView, movie = movie)
            },
            onDetails = { movie ->
                goToDetails(movie)
            }
        )

        recyclerView.adapter = adapter
        adapter.submitList(repository.movieList)
    }

    private fun deleteMovie(view: View,recyclerView: RecyclerView, movie: Movie) {
        val newList = repository.movieList.toMutableList()
        newList.remove(movie)
        adapter.submitList(newList)

        Snackbar.make(view.context, recyclerView, "Filme deletado com sucesso", Snackbar.LENGTH_LONG).show()
    }

    private fun goToDetails(movie: Movie) {
        val action = ListMoviesFragmentDirections.actionListMoviesFragmentToDetailsMovieFragment(movie)
        findNavController().navigate(action)
    }
}