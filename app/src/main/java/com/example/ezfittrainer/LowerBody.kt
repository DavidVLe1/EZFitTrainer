package com.example.ezfittrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LowerBody : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lower_body)
        val viewTimer = findViewById<View>(R.id.btnLowerViewTimer) as Button
        viewTimer.setOnClickListener{
            startActivity(
                Intent(
                    this@LowerBody,
                    Timer::class.java
                )
            )
        }
    }
}