package com.example.ezfittrainer

import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.ezfittrainer.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterAppButton = findViewById<View>(R.id.btnEnterApp) as Button;
        enterAppButton.setOnClickListener{
            startActivity(
                Intent(
                    this@MainActivity,
                    Mainpage::class.java
                )
            )
        }
    }
}