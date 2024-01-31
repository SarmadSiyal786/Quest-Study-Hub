package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class It1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it1);

        PDFView pdfView = findViewById(R.id.it1);
        pdfView.fromAsset("It1.pdf").load();
    }
}