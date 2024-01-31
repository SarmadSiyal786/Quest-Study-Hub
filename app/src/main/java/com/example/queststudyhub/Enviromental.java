package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enviromental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviromental);

        Button sem1,sem2,sem3,sem4;
        sem1=findViewById(R.id.enviroseme1);
        sem2=findViewById(R.id.enviroseme2);
        sem3=findViewById(R.id.enviroseme3);
        sem4=findViewById(R.id.enviroseme4);

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Enviromental.this, enviro4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Enviromental.this, enviro3.class);
                startActivity(next);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Enviromental.this, enviro2.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Enviromental.this, enviro1.class);
                startActivity(next);
            }
        });
    }
}