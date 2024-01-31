package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class electronic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);

        Button sem1,sem2,sem3,sem4;

        sem1=findViewById(R.id.electronicseme1);
        sem2=findViewById(R.id.electronicseme2);
        sem3=findViewById(R.id.electronicseme3);
        sem4=findViewById(R.id.electronicseme4);

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(electronic.this, electronic4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(electronic.this, electronic3.class);
                startActivity(next);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(electronic.this, electronic2.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(electronic.this, electronic1.class);
                startActivity(next);
            }
        });
    }
}