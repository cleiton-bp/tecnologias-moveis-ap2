package com.example.apdois.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.apdois.data.model.Movie

class MovieDiffCallback : DiffUtil.ItemCallback<Movie>() {

    // Verifica se os IDs dos filmes são iguais
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id == newItem.id
    }

    // Verifica se o conteúdo do filme mudou
    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem == newItem
    }
}