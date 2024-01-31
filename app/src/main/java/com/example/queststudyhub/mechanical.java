package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mechanical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);

        Button sem1,sem2,sem3,sem4,sem5,sem6;
        sem1=findViewById(R.id.Meseme1);
        sem2=findViewById(R.id.Meseme2);
        sem3=findViewById(R.id.Meseme3);
        sem4=findViewById(R.id.Meseme4);
        sem5=findViewById(R.id.Meseme5);
        sem6=findViewById(R.id.Meseme6);

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(mechanical.this, mechanical6.class);
                startActivity(next);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(mechanical.this, mechanical5.class);
                startActivity(next);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(mechanical.this, mechanical4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(mechanical.this, mechanical3.class);
                startActivity(next);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(mechanical.this, mechanical2.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(mechanical.this,mechanical1.class);
                startActivity(next);
            }
        });

    }
}