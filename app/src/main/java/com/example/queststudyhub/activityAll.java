package com.example.queststudyhub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class activityAll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);


        ImageButton imageButton1,imageButton2,imageButton3,imageButton4;

        imageButton1=findViewById(R.id.course);
        imageButton2=findViewById(R.id.paper);
        imageButton3=findViewById(R.id.calculator);
        imageButton4=findViewById(R.id.about);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(activityAll.this, About_Me.class);
                startActivity(next);
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iNext=new Intent(activityAll.this, course_Button.class);
                startActivity(iNext);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iNext=new Intent(activityAll.this,paper_Button.class);
                startActivity(iNext);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(activityAll.this, GPA.class);
                startActivity(next);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shareicon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_share) {
            Intent iShare = new Intent(Intent.ACTION_SEND);
            iShare.setType("text/plain");
            iShare.putExtra(Intent.EXTRA_TEXT, "Download This App through link=http://google.com/store.sarmad");
            startActivity(Intent.createChooser(iShare, "Share via"));
            return true;          }
        return super.onOptionsItemSelected(item);
    }

}
