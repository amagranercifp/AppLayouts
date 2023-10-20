package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.List;

public class Activity3 extends AppCompatActivity {

    private ListView list_modulos;

    private ImageButton imageButtonCerrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        list_modulos = (ListView) findViewById(R.id.lvAmigos);

        imageButtonCerrar = (ImageButton) findViewById(R.id.imageButtonCerrar);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.arrayModulos, android.R.layout.simple_list_item_1);
        list_modulos.setAdapter(adaptador);
    }

    public void botonCerrar(View v){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}