package com.example.queststudyhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.Toast;

public class Subject_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject7);

        EditText eTxt1,eTxt2,eTxt3,eTxt4,eTxt5,eTxt6,eTxt7,eTxt8,eTxt9,eTxt10,eTxt11,eTxt12,eTxt13,eTxt14;
        Button btnCal, btnReset;
        TextView txtResult;

        eTxt1=findViewById(R.id.edt1);
        eTxt2=findViewById(R.id.edt2);
        eTxt3=findViewById(R.id.edt2_1);
        eTxt4=findViewById(R.id.edt2_2);
        eTxt5=findViewById(R.id.edt3_1);
        eTxt6=findViewById(R.id.edt3_2);
        eTxt7=findViewById(R.id.edt4_1);
        eTxt8=findViewById(R.id.edt4_2);
        eTxt9=findViewById(R.id.edt5_1);
        eTxt10=findViewById(R.id.edt5_2);
        eTxt11=findViewById(R.id.edt6_1);
        eTxt12=findViewById(R.id.edt6_2);
        eTxt13=findViewById(R.id.edt7_1);
        eTxt14=findViewById(R.id.edt7_2);
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
                eTxt7.setText("");
                eTxt8.setText("");
                eTxt9.setText("");
                eTxt10.setText("");
                eTxt11.setText("");
                eTxt12.setText("");
                eTxt13.setText("");
                eTxt14.setText("");
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
                    double e7 = Double.parseDouble(eTxt7.getText().toString());
                    double e8 = Double.parseDouble(eTxt8.getText().toString());
                    double e9 = Double.parseDouble(eTxt9.getText().toString());
                    double e10 = Double.parseDouble(eTxt10.getText().toString());
                    double e11 = Double.parseDouble(eTxt11.getText().toString());
                    double e12 = Double.parseDouble(eTxt12.getText().toString());
                    double e13 = Double.parseDouble(eTxt13.getText().toString());
                    double e14 = Double.parseDouble(eTxt14.getText().toString());

                    if (areAllEditTextsFilled()) {
                        double result = (e2 + e4 + e6 + e8 + e10 + e12+e14) / (e1 + e3 + e5 + e7 + e9 + e11+e13);
                        txtResult.setText("Your GPA :  " + result);
                    } else {

                        Toast.makeText(Subject_7.this, "Please fill all the fields.", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {

                    Toast.makeText(Subject_7.this, "Please Give Correct Inputs.", Toast.LENGTH_SHORT).show();

                }
            }

            private boolean areAllEditTextsFilled() {
                return !isEmpty(eTxt1) && !isEmpty(eTxt2) && !isEmpty(eTxt3) &&
                        !isEmpty(eTxt4) && !isEmpty(eTxt5) && !isEmpty(eTxt6) &&
                        !isEmpty(eTxt7) && !isEmpty(eTxt8) && !isEmpty(eTxt9) &&
                        !isEmpty(eTxt10) && !isEmpty(eTxt11) && !isEmpty(eTxt12) &&
                        !isEmpty(eTxt13) && !isEmpty(eTxt14);
            }

            private boolean isEmpty(EditText editText) {
                return TextUtils.isEmpty(editText.getText().toString().trim());
            }
        });

    }
}