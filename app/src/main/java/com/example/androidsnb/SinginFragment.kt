package com.example.androidsnb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SinginFragment : AppCompatActivity() {
    val g : String = "message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin)
        clik2()
    }
    private fun clik2(){
        findViewById<Button>(R.id.buttonInBack).setOnClickListener{
            val clikLog = Intent(this, MainActivity::class.java)
            startActivity(clikLog)
        }
        findViewById<Button>(R.id.buttonInLogin).setOnClickListener{
            val email = findViewById<TextInputEditText>(R.id.email).text.toString()
            val password = findViewById<TextInputEditText>(R.id.passwdLog).text.toString()
            if(password == "cxc" && email == "sova@gmail.com") {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("email","sova@gmail.com")
                intent.putExtra("pass","sova@gmail.com")
                startActivity(intent)
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