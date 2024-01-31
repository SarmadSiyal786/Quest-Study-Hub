package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Computer_Science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science);

        Button btnsem1, btnsem2, btnsem3, btnsem4, btnsem5, btnsem6;

        btnsem1=findViewById(R.id.bcsseme1);
        btnsem2=findViewById(R.id.bcsseme2);
        btnsem3=findViewById(R.id.bcsseme3);
        btnsem4=findViewById(R.id.bcsseme4);
        btnsem5=findViewById(R.id.bcsseme5);
        btnsem6=findViewById(R.id.bcsseme6);

        btnsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Computer_Science.this, bcs6.class);
                startActivity(next);
            }
        });

        btnsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Computer_Science.this, bcs5.class);
                startActivity(next);
            }
        });

        btnsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Computer_Science.this, bcs4.class);
                startActivity(next);
            }
        });

        btnsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Computer_Science.this, bcs3.class);
                startActivity(next);
            }
        });

        btnsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Computer_Science.this, bcs2.class);
                startActivity(next);
            }
        });

        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Computer_Science.this, bcs1.class);
                startActivity(next);
            }
        });
    }
}