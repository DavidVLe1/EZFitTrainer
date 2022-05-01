package com.example.ezfittrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class UpperBody : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upper_body)
        val viewTimer = findViewById<View>(R.id.btnUpperViewTimer) as Button
        viewTimer.setOnClickListener{
            startActivity(
                Intent(
                    this@UpperBody,
                    Timer::class.java
                )
            )
        }

    }
}