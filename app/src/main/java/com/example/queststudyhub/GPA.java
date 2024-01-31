package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GPA extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        Button btn1,btn2,btn3,btn4,btn5;
        btn1=findViewById(R.id.btn3);
        btn2=findViewById(R.id.btn4);
        btn3=findViewById(R.id.btn5);
        btn4=findViewById(R.id.btn6);
        btn5=findViewById(R.id.btn7);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(GPA.this,Subject_3.class);
                startActivity(next);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(GPA.this, Subject_4.class);
                startActivity(next);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(GPA.this,Subject_5.class);
                startActivity(next);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(GPA.this, Subject_6.class);
                startActivity(next);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(GPA.this, Subject_7.class);
                startActivity(next);
            }
        });

    }
}