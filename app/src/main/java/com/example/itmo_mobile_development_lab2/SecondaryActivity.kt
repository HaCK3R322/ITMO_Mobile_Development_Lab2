package com.example.itmo_mobile_development_lab2

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class SecondaryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondary_activity)

        val button = findViewById<ImageButton>(R.id.imageButton2)
        button.setOnClickListener{
            this.finThis()
        }
    }

    private fun finThis() {
        this.finish();
    }
}
