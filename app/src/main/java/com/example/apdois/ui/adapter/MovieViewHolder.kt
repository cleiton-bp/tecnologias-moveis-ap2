package com.example.apdois.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.apdois.data.model.Movie
import com.example.apdois.databinding.MovieItemListBinding

class MovieViewHolder(
    private val binding: MovieItemListBinding,
    private val onDelete: (Movie) -> Unit,
    private val onDetails: (Movie) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie) {
        binding.movie = movie

        // revisar
        binding.actionDeleteMovie.setOnClickListener {
            onDelete(movie)
        }

        // revisar
        binding.actionViewDetails.setOnClickListener {
            onDetails(movie)
        }
    }
}