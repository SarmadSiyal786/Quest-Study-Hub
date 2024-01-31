package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information_Tech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_tech);

        Button sem1,sem2,sem3,sem4,sem5,sem6;
        sem1=findViewById(R.id.itseme1);
        sem2=findViewById(R.id.itseme2);
        sem3=findViewById(R.id.itseme3);
        sem4=findViewById(R.id.itseme4);
        sem5=findViewById(R.id.itseme5);
        sem6=findViewById(R.id.itseme6);

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Information_Tech.this, It6.class);
                startActivity(next);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Information_Tech.this, It5.class);
                startActivity(next);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Information_Tech.this, It4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Information_Tech.this, It3.class);
                startActivity(next);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Information_Tech.this, It2.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Information_Tech.this, It1.class);
                startActivity(next);
            }
        });
    }
}