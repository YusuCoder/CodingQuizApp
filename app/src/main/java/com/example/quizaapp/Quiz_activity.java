package com.example.quizaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Quiz_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final String getSelectedLevel = getIntent().getStringExtra("slectedLevel");
    }
}