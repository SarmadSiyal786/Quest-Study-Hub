package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Artificial_Intelli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artificial_intelli);

        Button ai1,ai2;

        ai1=findViewById(R.id.aiseme1);
        ai2=findViewById(R.id.aiseme2);

        ai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Artificial_Intelli.this, AI2.class);
                startActivity(next);
            }
        });

        ai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(Artificial_Intelli.this, AI1.class);
                startActivity(next);
            }
        });
    }
}