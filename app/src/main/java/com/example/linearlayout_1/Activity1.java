package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    Button btnVolver;
    EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btnVolver = (Button) findViewById(R.id.btnVolver);
        etNombre = (EditText) findViewById(R.id.etNombre);
    }


    public void botonRegistrarse(View v){

        String nomUsuario;

        nomUsuario = etNombre.getText().toString();

        Intent intent = new Intent(this, Activity1_1.class);
        intent.putExtra("nomUsuario",nomUsuario);
        startActivity(intent);
    }

    public void botonVolver(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}