package com.example.triveni.saftyapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4Activity extends AppCompatActivity {
    String FileName = "myFile";
    Button BtnSave,BtnRead;
    EditText editNumber;
    TextView readNumber;
    String Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        BtnSave=(Button)findViewById(R.id.idBtnSave);
        BtnRead=(Button)findViewById(R.id.idBtnRead);
        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveFile();
            }
        });
        BtnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readFile();
            }

        });
        editNumber=(EditText)findViewById(R.id.idNumber);
        readNumber=(TextView)findViewById(R.id.idReadtxt);
            }
            private void readFile(){
                try{
                    File file= new File(getCacheDir(),FileName);
                    FileInputStream fin = new FileInputStream(file);
                    InputStreamReader inputStream = new InputStreamReader(fin);
                    BufferedReader bufferedReader = new BufferedReader(inputStream);
                    StringBuilder stringBuilder = new StringBuilder();
                    String line = null;
                    while ((line=bufferedReader.readLine())!=null){
                      StringBuilder append;String line1 = line;
                    }
                fin.close();
                inputStream.close();
                readNumber.setText("Number: "+stringBuilder.toString());
                Toast.makeText(this,"Data Retrieved :"+stringBuilder.toString(),Toast.LENGTH_SHORT).show();
            }
            catch (java.io.IOException e){
        e.printStackTrace();
    }
        }

    private void saveFile(){
        try {
            File file = new File(getCacheDir(), FileName);
            FileOutputStream fos = new FileOutputStream(file);
            Number = editNumber.getText().toString();
            fos.write(Number.getBytes());
            fos.close();
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
        }
}



