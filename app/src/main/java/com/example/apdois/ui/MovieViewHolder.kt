package com.example.apdois.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apdois.R
import com.example.apdois.data.model.Movie

class MovieViewHolder(
    private val itemView: View,
    private val onDelete: (Movie) -> Unit,
    private val onDetails: (Movie) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val title: TextView = itemView.findViewById(R.id.movieTitle)
    private val description: TextView = itemView.findViewById(R.id.movieDescription)
    private val info: TextView = itemView.findViewById(R.id.movieInfo)
    private val ratingYear: TextView = itemView.findViewById(R.id.movieRatingYear)
    private val actionDelete: TextView = itemView.findViewById(R.id.actionDeleteMovie)
    private val actionDetails: TextView = itemView.findViewById(R.id.actionViewDetails)

    fun bind(movie: Movie) {
        title.text = movie.title
        description.text = movie.description
        info.text = "${movie.genre} • ${movie.director}"
        ratingYear.text = "★ ${movie.rating} • ${movie.releaseYear}"

        actionDelete.setOnClickListener {
            onDelete(movie)
        }

        actionDetails.setOnClickListener {
            onDetails(movie)
        }

        // Visual feedback para "assistido"
        styleWatched(movie.watched)
    }

    private fun styleWatched(watched: Boolean) {
        if (watched) {
            title.alpha = 0.6f
            description.alpha = 0.6f
            info.alpha = 0.6f
            ratingYear.alpha = 0.6f
        } else {
            title.alpha = 1.0f
            description.alpha = 1.0f
            info.alpha = 1.0f
            ratingYear.alpha = 1.0f
        }
    }
}