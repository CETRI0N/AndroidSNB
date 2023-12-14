package com.example.androidsnb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    val g : String = "message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        clik2()
        findViewById<TextView>(R.id.sovichat).text =intent.getStringExtra("email")
    }
    private fun clik2(){
        findViewById<Button>(R.id.buttonChatBack).setOnClickListener{
            val clikBack = Intent(this, MainActivity::class.java)
            startActivity(clikBack)
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