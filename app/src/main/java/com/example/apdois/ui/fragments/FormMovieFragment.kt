package com.example.apdois.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.apdois.R
import com.example.apdois.data.model.Movie
import com.example.apdois.databinding.FragmentFormMovieBinding
import com.example.apdois.ui.viewmodel.MovieViewModel

class FormMovieFragment : Fragment() {
    private lateinit var binding : FragmentFormMovieBinding
    private val movieViewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFormMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSave.setOnClickListener {
            val movie = Movie(
                title = binding.inputTitle.text.toString(),
                description = binding.inputDescription.text.toString(),
                genre = binding.inputGenre.text.toString(),
                director = binding.inputDirector.text.toString(),
                releaseYear = binding.inputReleaseYear.text.toString().toIntOrNull() ?: 0,
                rating = binding.inputRating.text.toString().toDoubleOrNull() ?: 0.0,
                watched = binding.inputWatched.isChecked,
                createdAt = binding.inputCreatedAt.text.toString(),
                addedBy = binding.inputAddedBy.text.toString(),
                imageUrl = binding.inputImageUrl.text.toString()
            )

            movieViewModel.addMovie(movie)

            val action = FormMovieFragmentDirections.actionFormMovieFragmentToListMoviesFragment()
            findNavController().navigate(action)
        }
    }
}