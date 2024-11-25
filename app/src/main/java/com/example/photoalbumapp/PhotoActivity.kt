package com.example.photoalbumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PhotoActivity : AppCompatActivity() {

    private val photos = listOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo5
    )
    private var currentPhotoIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnNextPhoto = findViewById<Button>(R.id.btnNextPhoto)


        imageView.setImageResource(photos[currentPhotoIndex])

        btnNextPhoto.setOnClickListener {
            currentPhotoIndex++
            if (currentPhotoIndex < photos.size) {

                imageView.setImageResource(photos[currentPhotoIndex])
            } else {

                val intent = Intent(this, FinalActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}

enum class FinalActivity {

}
