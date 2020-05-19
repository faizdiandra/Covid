package com.example.s2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main3Activity : AppCompatActivity() {
    private lateinit var kembali: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        kembali = findViewById(R.id.kembali)
        kembali.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}
