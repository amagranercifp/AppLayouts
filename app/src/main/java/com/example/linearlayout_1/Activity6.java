package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        btnVolver = (Button) findViewById(R.id.btnVolverGrid);
    }

    public void btnChat(View v){
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }

    public void btnVolverGrid(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}