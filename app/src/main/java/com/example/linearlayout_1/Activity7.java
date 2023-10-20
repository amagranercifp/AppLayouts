package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity7 extends AppCompatActivity {

    private ImageButton imageButtonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        imageButtonVolver = (ImageButton) findViewById(R.id.botonVolverChat);


    }

    public void botonVolverChat(View v){

        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);

    }
}