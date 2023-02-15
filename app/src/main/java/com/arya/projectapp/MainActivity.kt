package com.arya.projectapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val formorebtn = findViewById<Button>(R.id.formorebtn)

        formorebtn.setOnClickListener {
            intent = Intent(applicationContext, screen2::class.java)
            startActivity(intent)
        }
    }
}