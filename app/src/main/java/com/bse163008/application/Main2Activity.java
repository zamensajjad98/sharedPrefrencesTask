package com.bse163008.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        SharedPreferences sharedpreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String name=sharedpreferences.getString("nameKey","");
        String email=sharedpreferences.getString("emailKey","");
        String age=sharedpreferences.getString("ageKey","");
        String address=sharedpreferences.getString("addressKey","");
        String gender=sharedpreferences.getString("genderKey","");


        TextView textView=findViewById(R.id.textView);
        textView.setText(name);

        textView=findViewById(R.id.textView4);
        textView.setText(email);

        textView=findViewById(R.id.textView6);
        textView.setText(age);


        textView= findViewById(R.id.textView7);
        textView.setText(address);

        textView=findViewById(R.id.textView10);
        textView.setText(gender);




    }
}
