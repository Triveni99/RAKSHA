package com.example.triveni.saftyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button bn1, bn2, bn3, bn4, bn5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bn1 = (Button) findViewById(R.id.button2);
        bn2 = (Button) findViewById(R.id.button3);
        bn3 = (Button) findViewById(R.id.button4);
        bn4 = (Button) findViewById(R.id.button5);
        bn5 = (Button) findViewById(R.id.button6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1 = new
                        Intent(Main2Activity.this, Main3Activity.class);
                startActivity(I1);
            }});
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I2=new
                        Intent(Main2Activity.this,MainActivity.class);
                startActivity(I2);
            }
        });

        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I2=new
                        Intent(Main2Activity.this,Main5Activity.class);
                startActivity(I2);
            }
        });



    }
}

