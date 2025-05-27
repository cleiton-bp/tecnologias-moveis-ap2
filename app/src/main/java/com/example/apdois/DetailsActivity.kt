package com.example.apdois

import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.apdois.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.URL

class DetailsActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val title = findViewById<TextView>(R.id.movieTitle)
        val description = findViewById<TextView>(R.id.movieDescription)
        val date = findViewById<TextView>(R.id.movieCreatedAt)
        val user = findViewById<TextView>(R.id.movieAddedBy)
        val image = findViewById<ImageView>(R.id.movieImage)

        intent.extras?.getSerializable("movie", Movie::class.java).also {
            it?.let { movie ->
                title.text = movie.title
                description.text = "${movie.description}\n\nGênero: ${movie.genre}\nDiretor: ${movie.director}\nAno: ${movie.releaseYear}\nNota: ${movie.rating}"
                date.text = "Adicionado em: ${movie.createdAt}"
                user.text = "Adicionado por: ${movie.addedBy}"

                // Carrega a imagem da internet
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        val inputStream = URL(movie.imageUrl).openStream()
                        val bitmap = BitmapFactory.decodeStream(inputStream)
                        runOnUiThread {
                            image.setImageBitmap(bitmap)
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}