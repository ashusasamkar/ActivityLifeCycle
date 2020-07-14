package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity : ","Activity Created...")
        setContentView(R.layout.activity_main)
        val click_btn = findViewById<Button>(R.id.button)
        click_btn.setOnClickListener {
            intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity : ","Activity Started...")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity : ","Activity Resumed...")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity : ","Activity Paused...")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity : ","Activity Stopped...")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity : ","Activity Destroyed...")
    }
}