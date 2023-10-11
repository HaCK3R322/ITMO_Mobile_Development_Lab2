package com.example.itmo_mobile_development_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.proper)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Вот такие пироги!"

        val button = findViewById<Button>(R.id.button)
        button.text = "Сделать больше микрочелов"
        button.setOnClickListener{
            openSecondActivity()
        }
    }

    fun openSecondActivity() {
        val intent = Intent(this, SecondaryActivity::class.java)
        startActivity(intent)
    }
}