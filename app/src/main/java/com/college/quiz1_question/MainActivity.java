package com.college.quiz1_question;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //counterView is the TextView that displays the value of the counter
        TextView counterView = findViewById(R.id.counterId);

        //TODO
        // Your code goes here

        // Reset the counter to 0 if user clicks reset
        Button resetButton = findViewById(R.id.buttonResetId);
        resetButton.setOnClickListener( (click) -> {
            mCounter = 0;
            counterView.setText("" + mCounter);
        });

        // Increase the counter by 1 each time the user clicks on increment
        Button incrementButton = findViewById(R.id.buttonIncId);
        incrementButton.setOnClickListener( (click) -> {
            mCounter += 1;
            counterView.setText("" + mCounter);
        });

        // Decrease the counter by 1 each time the user clicks on decrement
        Button decrementButton = findViewById(R.id.buttonDecId);
        decrementButton.setOnClickListener( (click) -> {
            mCounter -= 1;
            counterView.setText("" + mCounter);
        });
    }
}