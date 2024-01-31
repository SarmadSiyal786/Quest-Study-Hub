package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeleCommunication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele_communication);

        Button sem1,sem2,sem3,sem4,sem5;
        sem1=findViewById(R.id.teleseme1);
        sem2=findViewById(R.id.teleseme2);
        sem3=findViewById(R.id.teleseme3);
        sem4=findViewById(R.id.teleseme4);
        sem5=findViewById(R.id.teleseme5);

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(TeleCommunication.this, tele5.class);
                startActivity(next);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(TeleCommunication.this, tele4.class);
                startActivity(next);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(TeleCommunication.this, tele3.class);
                startActivity(next);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(TeleCommunication.this, tele2.class);
                startActivity(next);
            }
        });

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(TeleCommunication.this, tele1.class);
                startActivity(next);
            }
        });
    }
}