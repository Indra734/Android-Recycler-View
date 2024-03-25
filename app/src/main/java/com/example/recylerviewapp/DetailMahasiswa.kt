package com.example.recylerviewapp

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class DetailMahasiswa : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imgMahasiswa = intent.getIntExtra("gambar", R.drawable.user)
        val namaMahasiswa = intent.getStringExtra("nama")
        val nimMahasiswa = intent.getStringExtra("nim")

        val imgImageView = findViewById<ImageView>(R.id.gambar)
        val namaTextView = findViewById<TextView>(R.id.nama)
        val nimTextView = findViewById<TextView>(R.id.nim)

        imgImageView.setImageResource(imgMahasiswa)
        namaTextView.text = namaMahasiswa
        nimTextView.text = nimMahasiswa
    }

}