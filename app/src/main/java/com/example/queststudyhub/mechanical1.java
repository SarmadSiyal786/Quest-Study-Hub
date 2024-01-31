package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mechanical1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical1);

        PDFView pdfView = findViewById(R.id.me1);
        pdfView.fromAsset("mechanical1.pdf").load();
    }
}