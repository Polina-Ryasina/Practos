package com.example.practos

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val email = findViewById<TextInputEditText>(R.id.email)
        val pass= findViewById<TextInputEditText>(R.id.password)
        val actionButton = findViewById<Button>(R.id.but)

        val watcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val email = email.text.toString()
                val pass = pass.text.toString()
                val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
                val isPassValid = isValid(pass)

                actionButton.isEnabled = isEmailValid && isPassValid
            }
        }

        email.addTextChangedListener(watcher)
        pass.addTextChangedListener(watcher)

        actionButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("email", email.text.toString())
            intent.putExtra("pass", pass.text.toString())
            startActivity(intent)
        }
    }

    private fun isValid(pass: String): Boolean {
        if (pass.length < 8) return false
        val hasDigit = pass.any { it.isDigit() }
        val hasUpper = pass.any { it.isUpperCase() }
        val hasLower = pass.any { it.isLowerCase() }
        return hasDigit && hasUpper && hasLower
    }
}
