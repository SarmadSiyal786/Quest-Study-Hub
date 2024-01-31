package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class course_Button extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_button);


        Button btnCS,btnCSE,btnSE,btnIT,btnAI,btnElectric,btnEEE,btnElectronic,btnEnvironmental,btnCH,btnCHEM,btnME,
        btnES,btnTCE,btnCBR,btnFET,btnIME,btnMS,btnPHY,btnBME,btnACE,btnEnglish;

        btnEnglish=findViewById(R.id.btnENG);
        btnACE=findViewById(R.id.btnACE);
        btnAI=findViewById(R.id.btnAI);
        btnCBR=findViewById(R.id.btnCBS);
        btnCS=findViewById(R.id.btnCS);
        btnCSE=findViewById(R.id.btnCSE);
        btnSE=findViewById(R.id.btnSE);
        btnCH=findViewById(R.id.btnCH);
        btnIT=findViewById(R.id.btnIT);
        btnElectric=findViewById(R.id.btnEE);
        btnEnvironmental=findViewById(R.id.btnEME);
        btnElectronic=findViewById(R.id.btnE_E);
        btnEEE=findViewById(R.id.btnEEE);
        btnCHEM=findViewById(R.id.btnCHEM);
        btnME=findViewById(R.id.btnME);
        btnMS=findViewById(R.id.btnMS);
        btnES=findViewById(R.id.btnESE);
        btnTCE=findViewById(R.id.btnTCE);
        btnFET=findViewById(R.id.btnFET);
        btnIME=findViewById(R.id.btnIME);
        btnPHY=findViewById(R.id.btnPHY);
        btnBME=findViewById(R.id.btnBM);


        btnElectronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Elecetric_e.class);
                startActivity(next);
            }
        });
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, english_course.class);
                startActivity(next);
            }
        });
        btnCHEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Chem_course.class);
                startActivity(next);
            }
        });

        btnEEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Eee_course.class);
                startActivity(next);
            }
        });
        btnEnvironmental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Enviroment_e.class);
                startActivity(next);
            }
        });
        btnElectric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Elecetric_e.class);
                startActivity(next);
            }
        });
        btnIME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Ime_course.class);
                startActivity(next);
            }
        });

        btnFET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this,Fet_course.class);
                startActivity(next);
            }
        });

        btnTCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this,Tce_course.class);
                startActivity(next);
            }
        });

        btnES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this, Es_course.class);
                startActivity(next);
            }
        });
        btnMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this,Ms_course.class);
                startActivity(next);
            }
        });
        btnME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(course_Button.this,Me_course.class);
                startActivity(next);
            }
        });
        btnPHY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this,Phy_course.class);
                startActivity(iNext);
            }
        });
        btnBME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this,bme_course.class);
                startActivity(iNext);
            }
        });
        btnIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this,it_course.class);
                startActivity(iNext);
            }
        });

        btnACE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iNext=new Intent(course_Button.this,Ace_course.class);
                startActivity(iNext);
            }
        });
        btnCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this, cs_course.class);
                startActivity(iNext);
            }
        });
        btnCBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext=new Intent(course_Button.this,Cbr_course.class);
                startActivity(inext);
            }
        });
        btnAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this, Ai_course.class);
                startActivity(iNext);
            }
        });
        btnCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this,Ch_course.class);
                startActivity(iNext);
            }
        });
        btnCSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this,cse_course.class);
                startActivity(iNext);
            }
        });
        btnSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(course_Button.this,se_course.class);
                startActivity(iNext);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
