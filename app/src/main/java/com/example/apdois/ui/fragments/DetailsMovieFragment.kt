package com.example.apdois.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.apdois.R

class DetailsMovieFragment : Fragment() {
    val args: DetailsMovieFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movie = args.movie

        view.findViewById<TextView>(R.id.movieTitle).text = movie.title
        view.findViewById<TextView>(R.id.movieDescription).text = movie.description
        view.findViewById<TextView>(R.id.movieCreatedAt).text = movie.createdAt
        view.findViewById<TextView>(R.id.movieAddedBy).text = movie.addedBy
//        view.findViewById<TextView>(R.id.movieImage).text = movie.imageUrl

    }
}