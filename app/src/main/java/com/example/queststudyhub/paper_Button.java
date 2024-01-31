package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paper_Button extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_button);

        Button btnbcs, btnit, btnai, btneng, btnsw, btncs, btnenviro, btnelectrical, btnelectro, btncivil, btnmech, btntele;

       btnbcs=findViewById(R.id.btnCS);
       btncs=findViewById(R.id.btnCSE);
       btnai=findViewById(R.id.btnAI);
       btncivil=findViewById(R.id.btncivil);
       btnelectrical=findViewById(R.id.btnEE);
       btnelectro=findViewById(R.id.btnE_E);
       btneng=findViewById(R.id.btnENG);
       btnenviro=findViewById(R.id.btnEME);
       btnit=findViewById(R.id.btnIT);
       btnsw=findViewById(R.id.btnSE);
       btnmech=findViewById(R.id.btnME);
       btntele=findViewById(R.id.btnTCE);

       btntele.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, TeleCommunication.class);
               startActivity(next);
           }
       });

       btnmech.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, mechanical.class);
               startActivity(next);
           }
       });

       btnenviro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, Enviromental.class);
               startActivity(next);
           }
       });

       btnsw.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, Software.class);
               startActivity(next);
           }
       });

       btnit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, Information_Tech.class);
               startActivity(next);
           }
       });

       btneng.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, EnglishSemesters.class);
               startActivity(next);
           }
       });

       btnelectro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, electronic.class);
               startActivity(next);
           }
       });

       btnelectrical.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, electrical.class);
               startActivity(next);
           }
       });

       btncs.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, Computer_System.class);
               startActivity(next);
           }
       });

       btncivil.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this,Civil_Engineering.class);
               startActivity(next);
           }
       });

       btnai.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this, Artificial_Intelli.class);
               startActivity(next);
           }
       });

       btnbcs.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent next=new Intent(paper_Button.this,Computer_Science.class);
               startActivity(next);
           }
       });

    }
}