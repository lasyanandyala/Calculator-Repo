package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            if((number1ET.getText().toString()).equals("") || (number2ET.getText().toString()).equals("")){
                numberSumTV.setText("Try Again");
            }
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1+num2;
            numberSumTV.setText("Answer: " + sum);
        }catch(Exception e){
            numberSumTV.setText("Try Again");
        }
    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            if((number1ET.getText().toString()).equals("") || (number2ET.getText().toString()).equals("")){
                numberSumTV.setText("Try Again");
            }
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int diff = num1-num2;
            numberSumTV.setText("Answer: " + diff);
        }catch(Exception e){
            numberSumTV.setText("Try Again");
        }
    }

    public void findDiv(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            if((number1ET.getText().toString()).equals("") || (number2ET.getText().toString()).equals("")){
                numberSumTV.setText("Try Again");
            }
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int div = num1 / num2;
            double extra = num1 % num2;
            numberSumTV.setText("Answer: " + div + extra);
        }catch(Exception e){
            numberSumTV.setText("Try Again");
        }
    }

    public void findMul(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            if((number1ET.getText().toString()).equals("") || (number2ET.getText().toString()).equals("")){
                numberSumTV.setText("Try Again");
            }
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int mul = num1 * num2;
            numberSumTV.setText("Answer: " + mul);
        }catch(Exception e){
            numberSumTV.setText("Try Again");
        }
    }

    public void findMod(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            if((number1ET.getText().toString()).equals("") || (number2ET.getText().toString()).equals("")){
                numberSumTV.setText("Try Again");
            }
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int mod = num1 % num2;
            numberSumTV.setText("Answer: " + mod);
        }catch(Exception e){
            numberSumTV.setText("Try Again");
        }
    }

}