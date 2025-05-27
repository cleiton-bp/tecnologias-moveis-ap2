package com.example.apdois.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.apdois.R
import com.example.apdois.data.model.Movie

class MovieAdapter(
    private val onDelete: (Movie) -> Unit,
    private val onDetails: (Movie) -> Unit
) : ListAdapter<Movie, MovieViewHolder>(MovieDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_list, parent, false)
        return MovieViewHolder(itemView = itemView, onDelete = onDelete, onDetails = onDetails)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
