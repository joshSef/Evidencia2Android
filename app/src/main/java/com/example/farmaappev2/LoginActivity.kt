package com.example.farmaappev2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragment_log_in)

        val btnLogIn = findViewById<Button>(R.id.btnLogIn)
        btnLogIn.setOnClickListener {

            val intent = Intent(this, BienvenidaActivity::class.java)
            startActivity(intent)
        }

        val btnSignUp = findViewById<Button>(R.id.sign_up_button)
        btnSignUp.setOnClickListener {

            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}