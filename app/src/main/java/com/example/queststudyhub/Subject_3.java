package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.Toast;

public class Subject_3 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject3);

        EditText eTxt1,eTxt2,eTxt3,eTxt4,eTxt5,eTxt6;
        Button btnCal, btnReset;
        TextView txtResult;

        eTxt1=findViewById(R.id.edt1);
        eTxt2=findViewById(R.id.edt2);
        eTxt3=findViewById(R.id.edt2_1);
        eTxt4=findViewById(R.id.edt2_2);
        eTxt5=findViewById(R.id.edt3_1);
        eTxt6=findViewById(R.id.edt3_2);
        btnCal=findViewById(R.id.btnCal);
        btnReset=findViewById(R.id.btnReset);
        txtResult=findViewById(R.id.txtResult);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eTxt1.setText("");
                eTxt2.setText("");
                eTxt3.setText("");
                eTxt4.setText("");
                eTxt5.setText("");
                eTxt6.setText("");
                txtResult.setText("");
            }
        });


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double e1 = Double.parseDouble(eTxt1.getText().toString());
                    double e2 = Double.parseDouble(eTxt2.getText().toString());
                    double e3 = Double.parseDouble(eTxt3.getText().toString());
                    double e4 = Double.parseDouble(eTxt4.getText().toString());
                    double e5 = Double.parseDouble(eTxt5.getText().toString());
                    double e6 = Double.parseDouble(eTxt6.getText().toString());

                    if (areAllEditTextsFilled()) {
                        double result = (e2 + e4 + e6) / (e1 + e3 + e5);
                        txtResult.setText("Your GPA :  " + result);
                    } else {
                        Toast.makeText(Subject_3.this, "Please fill in all the fields.", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    // Handle the case where parsing fails (e.g., non-numeric input)
                    Toast.makeText(Subject_3.this, "Please Give Correct Inputs.", Toast.LENGTH_SHORT).show();

                }
            }

            private boolean areAllEditTextsFilled() {
                return !isEmpty(eTxt1) && !isEmpty(eTxt2) && !isEmpty(eTxt3) &&
                        !isEmpty(eTxt4) && !isEmpty(eTxt5) && !isEmpty(eTxt6);
            }

            private boolean isEmpty(EditText editText) {
                return TextUtils.isEmpty(editText.getText().toString().trim());
            }
        });

    }
}