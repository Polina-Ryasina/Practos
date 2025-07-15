package com.example.practos

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val emailView = findViewById<TextView>(R.id.text1)
        val passView = findViewById<TextView>(R.id.text2)

        emailView.text = intent.getStringExtra("email") ?: "Нема email"
        passView.text = intent.getStringExtra("pass") ?: "Нема пароля"

    }
}
