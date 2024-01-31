package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civil_Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_engineering);

        Button sem1,sem2,sem3,sem4,sem5,sem6;

        sem1=findViewById(R.id.civilseme1);
        sem2=findViewById(R.id.civilseme2);
        sem3=findViewById(R.id.civilseme3);
        sem4=findViewById(R.id.civilseme4);
        sem5=findViewById(R.id.civilseme5);
        sem6=findViewById(R.id.civilseme6);

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Civil_Engineering.this, Civil6.class);
                startActivity(next);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Civil_Engineering.this, Civil5.class);
                startActivity(next);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Civil_Engineering.this, Civil4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Civil_Engineering.this, Civil3.class);
                startActivity(next);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Civil_Engineering.this, Civil2.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Civil_Engineering.this, Civil1.class);
                startActivity(next);
            }
        });
    }
}