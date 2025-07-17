package com.example.practos2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import androidx.core.widget.addTextChangedListener

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)
        val input = findViewById<TextInputEditText>(R.id.zifri)
       val button = findViewById<Button>(R.id.button)

        input.addTextChangedListener {
            val number = input.text?.toString()?.toIntOrNull()
            button.isEnabled = number != null && number in 1..8
        }

        button.setOnClickListener {
            val count = input.text.toString().toInt()
            Models.generateListModels(count)
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}