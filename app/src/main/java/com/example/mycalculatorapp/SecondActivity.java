package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //add code here that we get from an intent that
        //is needed to help set up the page

        //getting the letter from the mail receiving the sent info
        Intent intent = getIntent();
        //retrieving the data that was sent and labeled as NAME
        //there are may methods for getting diff data types
        String nameToShow = intent.getStringExtra("NAME");
        //getting a reference to the textView in the xml file for THIS activity
        TextView textView = findViewById(R.id.userName);
        //change the  text for the textView on this screen
        textView.setText(nameToShow);
    }


}