package com.example.androidsnb
import android.content.Intent
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainFragment : AppCompatActivity() {
    val g : String = "message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clik()
    }
    private fun clik(){
        findViewById<Button>(R.id.buttonIn).setOnClickListener{
            val clik = Intent(this, SinginActivity::class.java)
            startActivity(clik)
        }
        findViewById<Button>(R.id.buttonReg).setOnClickListener{
            val clik2 = Intent(this, RegisterActivity::class.java)
            startActivity(clik2)
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