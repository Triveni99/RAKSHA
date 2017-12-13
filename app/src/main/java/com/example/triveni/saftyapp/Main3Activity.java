package com.example.triveni.saftyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button bn1,bn2,bn3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        bn1=(Button)findViewById(R.id.button7);
        bn2=(Button)findViewById(R.id.button8);
        bn3=(Button)findViewById(R.id.button9);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1=new
                        Intent(Main3Activity.this,Main4Activity.class);
                startActivity(I1);

            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1=new
                        Intent(Main3Activity.this,MapsActivity.class);
                startActivity(I1);

            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1=new
                        Intent(Main3Activity.this,Main6Activity.class);
                startActivity(I1);
            }
        });


            }
        };



