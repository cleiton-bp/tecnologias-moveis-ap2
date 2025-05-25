package com.example.apdois.data

import com.example.apdois.data.model.Movie

class MovieRepository {
    val movieList = listOf(
        Movie(
            1,
            "Toy Story",
            "Brinquedos ganham vida quando ninguém está olhando.",
            "Animação",
            "John Lasseter",
            1995,
            4.8,
            true,
            "01/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            2,
            "Shrek",
            "Um ogro parte em uma missão para salvar uma princesa.",
            "Animação",
            "Andrew Adamson",
            2001,
            4.7,
            true,
            "02/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            3,
            "Frozen",
            "A rainha Elsa deve controlar seus poderes congelantes.",
            "Animação",
            "Chris Buck",
            2013,
            4.4,
            false,
            "03/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            4,
            "Divertida Mente",
            "As emoções de uma garota ganham vida.",
            "Animação",
            "Pete Docter",
            2015,
            4.6,
            false,
            "04/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            5,
            "Procurando Nemo",
            "Um peixe-palhaço atravessa o oceano para resgatar seu filho.",
            "Animação",
            "Andrew Stanton",
            2003,
            4.7,
            false,
            "05/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            6,
            "Os Incríveis",
            "Uma família de super-heróis tenta viver uma vida normal.",
            "Animação",
            "Brad Bird",
            2004,
            4.6,
            false,
            "06/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            7,
            "Ratatouille",
            "Um rato sonha em se tornar um grande chef de cozinha.",
            "Animação",
            "Brad Bird",
            2007,
            4.5,
            false,
            "07/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            8,
            "Meu Malvado Favorito",
            "Um vilão se torna pai adotivo de três meninas.",
            "Animação",
            "Pierre Coffin",
            2010,
            4.3,
            false,
            "08/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            9,
            "Zootopia",
            "Uma coelha policial e uma raposa vigarista resolvem um mistério.",
            "Animação",
            "Byron Howard",
            2016,
            4.4,
            false,
            "09/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        ),
        Movie(
            10,
            "O Rei Leão",
            "Um jovem leão foge de seu reino após a morte de seu pai.",
            "Animação",
            "Roger Allers",
            1994,
            4.9,
            true,
            "10/06/2025",
            "Cleiton",
            "https://images.pexels.com/photos/4439425/pexels-photo-4439425.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
        )

    )

    fun getMovies() = movieList
}