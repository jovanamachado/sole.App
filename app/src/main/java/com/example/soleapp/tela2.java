package com.example.soleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        EditText edtInsira_prog = (EditText) findViewById(R.id.edtInsira);
        Button btninsira_prog = (Button) findViewById(R.id.btnInsira);

        btninsira_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float tela2;
                //PAREI AQUI// TENTANDO DESENVOLVER COMO O RESULTADO DA "TELA 2" IRÁ APARECER NA "TELA 3"//
            }
        });

    }
}