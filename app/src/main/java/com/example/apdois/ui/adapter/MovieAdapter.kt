package com.example.apdois.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.apdois.R
import com.example.apdois.data.model.Movie
import com.example.apdois.databinding.MovieItemListBinding

class MovieAdapter(
    private val onDelete: (Movie) -> Unit,
    private val onDetails: (Movie) -> Unit
) : ListAdapter<Movie, MovieViewHolder>(MovieDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding =
            MovieItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding = binding, onDelete = onDelete, onDetails = onDetails)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
