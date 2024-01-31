package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishSemesters extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_semesters);

        Button sem1,sem3,sem4,sem5;
        sem1=findViewById(R.id.englishsem1);
        sem3=findViewById(R.id.englishsem3);
        sem4=findViewById(R.id.englishsem4);
        sem5=findViewById(R.id.englishsem5);

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(EnglishSemesters.this, englishsem5.class);
                startActivity(next);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(EnglishSemesters.this, englishsem4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(EnglishSemesters.this, englishsem3.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(EnglishSemesters.this, englishsem1.class);
                startActivity(next);
            }
        });
    }
}