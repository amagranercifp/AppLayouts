package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);


        btnVolver = (Button) findViewById(R.id.btnVolver);
    }

    public void botonVolver(View v){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}