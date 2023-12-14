package com.example.androidsnb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.chat.User
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    val g: String = "registr"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        clik2()
    }

    private fun clik2() {
        findViewById<Button>(R.id.buttonBack).setOnClickListener {
            val clikBack = Intent(this, MainActivity::class.java)
            startActivity(clikBack)
        }
        findViewById<Button>(R.id.buttonLogin).setOnClickListener {

            val email = findViewById<TextInputLayout>(R.id.email).editText?.text.toString()
            val password = findViewById<TextInputLayout>(R.id.passwd).editText?.text.toString()
            val password2 = findViewById<TextInputLayout>(R.id.passwdChek).editText?.text.toString()

            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                if (password == password2) {
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("email", email)
                    intent.putExtra("password", password)
                    intent.putExtra("user", User(email, password))
                    startActivity(intent)
                } else {
                    Toast.makeText(applicationContext, "Пароль не совпадает", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(applicationContext, "Email введен некоректно", Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun onStart() {
        super.onStart()
        Log.i(g, "start")
    }
    override fun onStop() {
        super.onStop()
        Log.i(g, "start")
    }
    override fun onPause() {
        super.onPause()
        Log.i(g, "start")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(g, "start")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(g, "start")
    }
}