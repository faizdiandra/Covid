package com.example.s2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Index : AppCompatActivity() {

    private lateinit var corona: Button
    private lateinit var penyebaran: Button
    private lateinit var gejala: Button

    private lateinit var btnStudent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        corona = findViewById(R.id.Corona)
        corona.setOnClickListener{
            startActivity(Intent(this, Main2Activity::class.java))
        }

        penyebaran = findViewById(R.id.Penyebaran)
        penyebaran.setOnClickListener{
            startActivity(Intent(this, Main3Activity::class.java))
        }

        gejala = findViewById(R.id.Gejala)
        gejala.setOnClickListener{
            startActivity(Intent(this, Main4Activity::class.java))
        }

        btnStudent = findViewById(R.id.student)
        btnStudent.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}
