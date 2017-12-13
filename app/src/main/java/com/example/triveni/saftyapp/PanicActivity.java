package com.example.triveni.saftyapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PanicActivity extends AppCompatActivity {
    int i =0;
    MainActivity mainactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panic);
        b1=(Button)findViewById(R.id.button11);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mainactivity=new MainActivity();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent I1 = new Intent(PanicActivity.this,MainActivity.class);
                startActivity(I1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                Handler handler = new Handler();
                Runnable runn = new Runnable() {
                    @Override
                    public void run() {
                        i = 0;
                    }
                };
                if (i == 1){
                    Toast.makeText(getBaseContext(),"Double click on it", Toast.LENGTH_LONG).show();
                }
                else if (i==2){
                        i=0;

                    SmsManager smsManager=SmsManager.getDefault();
                    smsManager.sendTextMessage("+917675955862","+919912714221","hello"+ mainactivity.st3,null,null);
                    Toast.makeText(getBaseContext(),"Message send to the contacts", Toast.LENGTH_LONG).show();

                }

            }

        });
    }

}
