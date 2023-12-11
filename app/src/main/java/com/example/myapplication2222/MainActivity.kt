package com.example.myapplication2222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent


class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById<EditText>(R.id.editTextText)
        passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val loginButton: Button = findViewById<Button>(R.id.button)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "user" && password == "password") {
                showSuccessActivity()
            } else {
                showErrorActivity()
            }
        }
    }
    private fun showSuccessActivity() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        finish()
    }

    private fun showErrorActivity() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
}