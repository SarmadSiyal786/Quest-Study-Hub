package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mechanical6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical6);

        PDFView pdfView = findViewById(R.id.me6);
        pdfView.fromAsset("mechanical6.pdf").load();
    }
}