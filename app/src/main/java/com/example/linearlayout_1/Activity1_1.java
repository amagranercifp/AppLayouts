package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Activity1_1 extends AppCompatActivity {

    // Esta clase responde al boton de Registrarse, por lo que
    // mostraremos un texto con el nombre del usuario que haya introducido.

    private String nomUsuario;
    private TextView tvNombreUsuario;

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);

        tvNombreUsuario = (TextView) findViewById(R.id.tvNombreUsuario);

        // Recuperar los posibles valores que nos vienen del Activity 1

        Intent extra = getIntent();

        if(extra != null){
            nomUsuario = extra.getStringExtra("nomUsuario");
            tvNombreUsuario.setText(nomUsuario);
        }

        // Código para que tras 3 segundos el activity cree un intent de forma automática
        // para saltar a otro activity
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Activity1_1.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}