package com.bse163008.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    public static final String Age = "ageKey";
    public static final String Address = "addressKey";
    public static final String Gender = "genderKey";

    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void sendData(View view) {

        sharedpreferences = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);

        Intent intent = new Intent(this,Main2Activity.class);

        EditText editText=(EditText) findViewById(R.id.editText);
        String full_name=editText.getText().toString();

        editText=(EditText) findViewById(R.id.editText2);
        String email=editText.getText().toString();


        editText=(EditText) findViewById(R.id.editText3);
        String age=editText.getText().toString();

        editText=(EditText) findViewById(R.id.editText4);
        String address=editText.getText().toString();


        editText=(EditText) findViewById(R.id.editText5);
        String gender=editText.getText().toString();


        intent.putExtra("name",full_name);
        intent.putExtra("email",email);
        intent.putExtra("age",age);
        intent.putExtra("address",address);
        intent.putExtra("gender",gender);


        SharedPreferences.Editor editor = sharedpreferences.edit();


        editor.putString(Name, full_name);
        editor.putString(Email, email);
        editor.putString(Age, age);
        editor.putString(Address, address);
        editor.putString(Gender, gender);
        editor.apply();


        Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
