package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cse_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_course);

        PDFView pdfView = findViewById(R.id.pdfCse);
        pdfView.fromAsset("cse_1.pdf").load();
    }
}