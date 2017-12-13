package com.example.triveni.saftyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public String st1,st2,st3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      ImageButton ib;
       TextView tv;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib=(ImageButton)findViewById(R.id.imageButton);
        tv=(TextView)findViewById(R.id.textView);
        Main6Activity m1= new Main6Activity();
        MapsActivity m2= new MapsActivity();
        st1=m1.s1;
        st2=m2.localString;
        st3=st1+st2;
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I1=new
                        Intent(MainActivity.this,Main2Activity.class);
                startActivity(I1);
            }
        });
    }
}
