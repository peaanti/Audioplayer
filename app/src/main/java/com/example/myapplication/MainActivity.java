package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String login;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        getStrings();
        check();
    }


    @SuppressLint("ResourceType")
    public void getStrings(){
        EditText text = (EditText)findViewById(R.id.name);
        login = text.getText().toString();
        EditText text2 = (EditText)findViewById(R.id.pass);
        password = text2.getText().toString();
    }

    public void check(){
        if (login.equals("admin") && password.equals("admin")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(MainActivity.this, FailedActivity.class);
            startActivity(intent);
        }
    }
}