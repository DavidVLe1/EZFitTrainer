package com.example.ezfittrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Abs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs)
        val viewTimer = findViewById<View>(R.id.btnAbsViewTimer) as Button
        viewTimer.setOnClickListener{
            startActivity(
                Intent(
                    this@Abs,
                    Timer::class.java
                )
            )
        }
    }
}