package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class english_paper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_paper);

        Button sem1,sem3,sem4,sem5;
        sem1=findViewById(R.id.englishseme1);
        sem3=findViewById(R.id.englishseme3);
        sem4=findViewById(R.id.englishseme4);
        sem5=findViewById(R.id.englishseme5);

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(english_paper.this, englishsem5.class);
                startActivity(next);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(english_paper.this, englishsem4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(english_paper.this, englishsem3.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(english_paper.this, englishsem1.class);
                startActivity(next);
            }
        });
    }
}