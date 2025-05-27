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
            "24/05/2025",
            "Cleiton",
            "https://ingresso-a.akamaihd.net/b2b/production/uploads/article/image/574/CURIOSIDADES-SOBRE-TOY-STORY-CAPA.jpg"
        ),
        Movie(
            2,
            "Shrek",
            "Um ogro parte em uma missão para salvar uma princesa.",
            "Animação",
            "Andrew Adamson",
            2001,
            4.7,
            false,
            "24/05/2025",
            "Cleiton",
            "https://observatoriodocinema.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=904&height=508&format=.jpg&quality=91&imagick=/wp-content/uploads/2022/04/shrek-2-1200x675.jpg"
        ),
        Movie(
            3,
            "Monstros S.A.",
            "Dois monstros trabalham em uma fábrica que assusta crianças para gerar energia.",
            "Animação",
            "Pete Docter",
            2001,
            4.5,
            false,
            "24/05/2025",
            "Cleiton",
            "https://recreio.com.br/media/_versions/disney/monstrosss_sa_capa_widelg.jpg"
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
            "24/05/2025",
            "Cleiton",
            "https://rollingstone.com.br/media/_versions/2024/07/divertida-mente-2-se-torna-a-maior-animacao-da-historia-do-cinema_widelg.jpg"
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
            "24/05/2025",
            "Cleiton",
            "https://img.odcdn.com.br/wp-content/uploads/2024/06/procurando-nemo-1-1920x1080.jpg"
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
            "24/05/2025",
            "Cleiton",
            "https://cinevibes.com.br/wp-content/uploads/2024/08/Os-Incriveis-3-filme-tradicao-20-anos.jpg"
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
            "24/05/2025",
            "Cleiton",
            "https://fly.metroimg.com/upload/q_85,w_700/https://uploads.metroimg.com/wp-content/uploads/2016/07/01161158/Ratatouille-Movie.jpg"
        ),
        //aaaaaaaa
        Movie(
            8,
            "Meu Malvado Favorito",
            "Um vilão se torna pai adotivo de três meninas.",
            "Animação",
            "Pierre Coffin",
            2010,
            4.3,
            false,
            "24/05/2025",
            "Cleiton",
            "https://historinhaspradormir.com.br/wp-content/uploads/2024/09/malvado-favorito.webp"
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
            "24/05/2025",
            "Cleiton",
            "https://observatoriodocinema.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=904&height=508&format=.jpg&quality=91&imagick=/wp-content/uploads/2016/02/zootopia.jpg"
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
            "24/05/2025",
            "Cleiton",
            "https://jornalismorio.espm.br/wp-content/uploads/2024/09/o-rei-leao.jpg"
        )

    )

    fun getMovies() = movieList
}