package com.sw.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editText2);
        tv1 = findViewById(R.id.textView1);
    }
    @SuppressLint("SetTextI18n")
    public void doAdd(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result= a1+a2;
        tv1.setText(""+result);
    }
    @SuppressLint("SetTextI18n")
    public void doSub(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result= a1-a2;
        tv1.setText(""+result);
    }
    @SuppressLint("SetTextI18n")
    public void doMul(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result= a1*a2;
        tv1.setText(""+result);
    }
    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    @SuppressLint("SetTextI18n")
    public void doDiv(View V){
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        float result = a1 / a2;
        tv1.setText(""+result);
    }
}
