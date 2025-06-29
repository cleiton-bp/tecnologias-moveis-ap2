package com.example.apdois.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.apdois.R
import com.example.apdois.databinding.FragmentDetailsMovieBinding

class DetailsMovieFragment : Fragment() {
    private lateinit var binding: FragmentDetailsMovieBinding
    val args: DetailsMovieFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieArgs = args.movie
        binding.movie = movieArgs

        // Carrega imagem com Glide
        Glide.with(this)
            .load(movieArgs.imageUrl)
            .centerCrop()
            .into(binding.movieImage)
    }
}