package com.example.ezfittrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class Calculator : AppCompatActivity() {
    var calories = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val metabolicMET = findViewById<View>(R.id.txtMET) as EditText
        val weight = findViewById<View>(R.id.txtWeight) as EditText
        val calculate = findViewById<View>(R.id.btnCalculate) as Button
        val time = findViewById<View>(R.id.txtTime) as EditText
        val response = findViewById<View>(R.id.txtResponse) as TextView

        calculate.setOnClickListener(object: View.OnClickListener{

            override fun onClick(view: View){
                calories = (metabolicMET.text.toString().toInt()*3.5 *weight.text.toString().toDouble()*.453592 *time.text.toString().toDouble())/200
                val calorieFormat = DecimalFormat("#,###.##")
                response.text = "The total calories you burned was " + calorieFormat.format(calories) + " kcals."

            }
        })

    }
}