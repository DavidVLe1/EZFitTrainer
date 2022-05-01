package com.example.ezfittrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkoutAndCalorieHistory extends AppCompatActivity {
    Button writeBtnCalConsumed,writeBtnCalBurned,readBtnConsumed, readBtnBurned; // read is load
    TextView textCalBurned, textCalConsumed;
    EditText inputCalConsumed;
    EditText inputCalBurned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_and_calorie_history);

        writeBtnCalConsumed = findViewById(R.id.btnSaveCalConsumed);
        writeBtnCalBurned= findViewById(R.id.btnSaveCalBurned);
        inputCalConsumed = findViewById(R.id.editTextCalConsumed);
        inputCalBurned = findViewById(R.id.editTextCalBurned);
        textCalBurned = findViewById(R.id.txtCalHistoryBurned);
        textCalConsumed= findViewById(R.id.txtCalHistoryConsumed);
        readBtnConsumed = findViewById(R.id.btnLoadConsumed);
        readBtnBurned = findViewById(R.id.btnLoadBurned);

        writeBtnCalBurned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = inputCalBurned.getText().toString();
                writeToFile("caloriesBurned.txt", content);
                inputCalBurned.setText("");
            }
        });
        writeBtnCalConsumed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = inputCalConsumed.getText().toString();
                writeToFile("caloriesConsumed.txt", content);
                inputCalConsumed.setText("");
            }
        });
        readBtnConsumed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = readFromFile("caloriesConsumed.txt");
                textCalConsumed.setText(content);


            }
        });
        readBtnBurned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = readFromFile("caloriesBurned.txt");
                textCalBurned.setText(content);

            }
        });
    }

    public String readFromFile(String fileName){
        File path = getApplicationContext().getFilesDir();
        File readFrom = new File(path, fileName);
        byte[] content = new byte[(int) readFrom.length()];

        try {
            FileInputStream stream = new FileInputStream(readFrom);
            stream.read(content);
            return new String (content);
        } catch (Exception e){
            e.printStackTrace();
            return e.toString();
        }
    }

    public void writeToFile(String fileName, String content){
        File path = getApplicationContext().getFilesDir();
        try {
            FileOutputStream writer = new FileOutputStream(new File(path, fileName));
            writer.write(content.getBytes());
            writer.close();
            Toast.makeText(getApplicationContext(), "Saved to file: " + fileName, Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}