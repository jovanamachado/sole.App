package com.example.soleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        final EditText edtInsira_prog = (EditText) findViewById(R.id.edtInsira);
        Button btninsira_prog = (Button) findViewById(R.id.btnInsira);

        btninsira_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final float tela2;


         final EditText edtInsira;
         Button btnInsira;

         edtInsira = (EditText) findViewById(R.id.edtInsira);
         btnInsira = (Button) findViewById(R.id.btnInsira);

     btnInsira.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(tela2.this, tela3.class);

             float km, l;
             km = Float.parseFloat(edtInsira_prog.getText().toString());
             l = km / 13;


             intent.putExtra("Chave", (String.valueOf(l)));
             startActivity(intent);
             finish();
         }
     });
            }
        });

    }
}