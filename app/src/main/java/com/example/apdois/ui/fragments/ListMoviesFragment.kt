package com.example.apdois.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.apdois.R
import com.example.apdois.data.model.Movie
import com.example.apdois.databinding.FragmentListMoviesBinding
import com.example.apdois.ui.adapter.MovieAdapter
import com.example.apdois.ui.viewmodel.MovieViewModel
import com.google.android.material.snackbar.Snackbar

class ListMoviesFragment : Fragment() {
    private lateinit var binding: FragmentListMoviesBinding
    private lateinit var adapter: MovieAdapter
    private val movieViewModel: MovieViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        movieViewModel.movieList.observe(viewLifecycleOwner) { movie ->
            adapter.submitList(movie.toMutableList())
        }
        binding = FragmentListMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.recyclerView
        adapter = MovieAdapter(
            onDelete = { movie ->
                movieViewModel.removeMovie(movie)
//                Snackbar.make(view, "Filme deletado com sucesso!", Snackbar.LENGTH_SHORT).show()
            },
            onDetails = { movie ->
                goToDetails(movie)
            }
        )
        recyclerView.adapter = adapter

        binding.fabAdd.setOnClickListener {
            val action = ListMoviesFragmentDirections.actionListMoviesFragmentToFormMovieFragment()
            findNavController().navigate(action)
        }
    }

    private fun goToDetails(movie: Movie) {
        val action = ListMoviesFragmentDirections.actionListMoviesFragmentToDetailsMovieFragment(movie)
        findNavController().navigate(action)
    }
}