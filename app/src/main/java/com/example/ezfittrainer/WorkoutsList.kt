package com.example.ezfittrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import com.example.ezfittrainer.R

class WorkoutsList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workouts_list)

        val group = findViewById<View>(R.id.txtgroup) as Spinner
        var groupChoice: String? = null


        val viewSelection = findViewById<View>(R.id.btnViewSpecificWorkout) as Button
        viewSelection.setOnClickListener{
            groupChoice = group.selectedItem.toString()

            if (groupChoice=="Full Body"){
                startActivity(
                    Intent(
                        this@WorkoutsList,
                        FullBody::class.java
                    )
                )
            }
            if (groupChoice=="Upper Body"){
                startActivity(
                    Intent(
                        this@WorkoutsList,
                        UpperBody::class.java
                    )
                )
            }
            if (groupChoice=="Lower Body"){
                startActivity(
                    Intent(
                        this@WorkoutsList,
                        LowerBody::class.java
                    )
                )
            }
            if (groupChoice=="Abs"){
                startActivity(
                    Intent(
                        this@WorkoutsList,
                        Abs::class.java
                    )
                )
            }


        }
    }
}