package com.example.apdois

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.example.apdois.data.MovieRepository
import com.example.apdois.data.model.Movie
import com.example.apdois.ui.MovieAdapter
import com.google.android.material.snackbar.Snackbar
import com.example.apdois.R

class MainActivity : AppCompatActivity() {
    private val repository = MovieRepository()
    private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        adapter = MovieAdapter(
            onDelete = { movie ->
                deleteMovie(recyclerView, movie)
            },
            onDetails = { movie ->
                goToDetails(movie)
            }
        )

        recyclerView.adapter = adapter
        adapter.submitList(repository.movieList)
    }

    private fun deleteMovie(recyclerView: RecyclerView, movie: Movie) {
        val newList = repository.movieList.toMutableList()
        newList.remove(movie)
        adapter.submitList(newList)

        Snackbar.make(recyclerView, "Filme deletado com sucesso", Snackbar.LENGTH_LONG).show()
    }

    private fun goToDetails(movie: Movie) {
        val intent = Intent(this, DetailsActivity::class.java).apply {
            putExtras(bundleOf("movie" to movie))
        }
        startActivity(intent)
    }
}