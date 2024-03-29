package com.example.quizaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private String selectedLanguage = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        final LinearLayout kotlin = findViewById(R.id.Korlin_card);
        final LinearLayout java = findViewById(R.id.java_card);
        final LinearLayout js = findViewById(R.id.Js_card);
        final LinearLayout html = findViewById(R.id.html_card);
        final LinearLayout python = findViewById(R.id.python_card);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedLanguage = "Java";

                Intent intent = new Intent(MainActivity.this, QuizSet.class);
                startActivity(intent);

            }
        });

        kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedLanguage = "Kotlin";

                Intent intent = new Intent(MainActivity.this, QuizSet.class);
                startActivity(intent);

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedLanguage = "Python";

                Intent intent = new Intent( MainActivity.this, QuizSet.class);
                startActivity(intent);

            }
        });

        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedLanguage = "JavaScript";

                Intent intent = new Intent(MainActivity.this, QuizSet.class);
                startActivity(intent);

            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedLanguage = "Html";

                Intent intent = new Intent(MainActivity.this, QuizSet.class);
                startActivity(intent);

            }
        });


    }
}