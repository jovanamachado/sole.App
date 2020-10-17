package com.example.soleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class tela3 extends AppCompatActivity {



    EditText edtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);



        edtResult = (EditText) findViewById(R.id.edtResult);
        String valor = getIntent(). getStringExtra("Chave");
        edtResult.setText(valor);



    }
}