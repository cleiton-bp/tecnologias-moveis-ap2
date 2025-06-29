package com.example.apdois.data.model

import java.io.Serializable

data class Movie(
    val id: Int,
    val title: String,       //    "Toy Story",
    val description: String, //    "Brinquedos ganham vida quando ninguém está olhando.",
    val genre: String,       //    "Animação",
    val director: String,    //    "John Lasseter",
    val releaseYear: Int,    //    1995,
    val rating: Double,      //    4.8,
    val watched: Boolean,    //    true,
    val createdAt: String,   //    "24/05/2025",
    val addedBy: String,     //    "Cleiton",
    val imageUrl: String     //    "https://ingresso-a.akamaihd.net/b2b/production/uploads/article/image/574/CURIOSIDADES-SOBRE-TOY-STORY-CAPA.jpg"
) : Serializable
