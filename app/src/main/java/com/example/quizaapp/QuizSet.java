package com.example.quizaapp;

import static com.example.quizaapp.R.id.junior_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.LinkAddress;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class QuizSet extends AppCompatActivity {

    private String selectedLevel = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_set);


        final CardView Junior = findViewById(R.id.junior_card);
        final CardView Middle = findViewById(R.id.middleBtn);

        final Button Start = findViewById(R.id.startBtn);


      Junior.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              selectedLevel = "Junior";
              Junior.setBackgroundResource(R.drawable.rectangle_white_pressed);
              Middle.setBackgroundResource(R.drawable.rectangle_white_normal);

          }
      });

      Middle.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              selectedLevel = "Middle";
              Middle.setBackgroundResource(R.drawable.rectangle_white_pressed);
              Junior.setBackgroundResource(R.drawable.rectangle_white_normal);

          }
      });


      Start.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              if (selectedLevel.isEmpty()){

                  Toast.makeText(QuizSet.this, "Please choose the level first", Toast.LENGTH_SHORT).show();

              }
              else {

                  Intent intent = new Intent(QuizSet.this, Quiz_activity.class);
                  intent.putExtra("slectedLevel", selectedLevel);
                  startActivity(intent);

              }

          }
      });

    }
}