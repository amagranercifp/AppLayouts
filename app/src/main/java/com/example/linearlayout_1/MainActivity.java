package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLinear,btn_relative, btn_frame,btn_table, btnGrid, btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = (Button) findViewById(R.id.btnLinear);
        btn_frame = (Button) findViewById(R.id.btnFrame);
        btn_relative = (Button) findViewById(R.id.btnRelative);
        btn_table = (Button) findViewById(R.id.btnTable);
        btnGrid = (Button) findViewById(R.id.btnGrid);
        btnConstraint = (Button) findViewById(R.id.btnConstraint);

    }


    public void botonLinear(View v){
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }

    public void botonFrame(View v){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void botonRelative(View v){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void botonTable(View v){
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void botonGrid(View v){
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void btnConstraint(View v){
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }


}