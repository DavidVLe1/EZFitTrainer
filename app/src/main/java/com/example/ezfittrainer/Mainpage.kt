package com.example.ezfittrainer

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.ezfittrainer.R

class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)


        val viewTimer = findViewById<View>(R.id.btnViewTimer) as Button
        viewTimer.setOnClickListener{
            startActivity(
                Intent(
                    this@Mainpage,
                    Timer::class.java
                )
            )
        }
        val viewRecords = findViewById<View>(R.id.btnViewHistory) as Button
        viewRecords.setOnClickListener{
            startActivity(
                Intent(
                    this@Mainpage,
                    WorkoutAndCalorieHistory::class.java
                )
            )
        }
        val viewCalculator = findViewById<View>(R.id.btnCalorieCalculator) as Button
        viewCalculator.setOnClickListener{
            startActivity(
                Intent(
                    this@Mainpage,
                    Calculator::class.java
                )
            )
        }
        val viewWorkouts = findViewById<View>(R.id.btnViewWorkouts) as Button
        viewWorkouts.setOnClickListener{
            startActivity(
                Intent(
                    this@Mainpage,
                    WorkoutsList::class.java
                )
            )
        }
    }
}