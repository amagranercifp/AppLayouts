package com.example.linearlayout_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Activity2 extends AppCompatActivity {

    private VideoView videoView;
    private ImageButton imageButton,imageButtonPause, imageButtonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        videoView = (VideoView) findViewById(R.id.videoView);

        imageButton = (ImageButton) findViewById(R.id.imageButton);

        imageButtonPause = (ImageButton) findViewById(R.id.imageButtonPause);

        imageButtonVolver = (ImageButton) findViewById(R.id.imageButtonVolver);

        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.lluvia));

    }

    public void botonVolver(View v){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void botonPlay(View v){


        if(videoView.isActivated()){
            videoView.resume();
        }
        else{
            videoView.start();
        }

        imageButton.setVisibility(View.INVISIBLE);

        imageButtonPause.setVisibility(View.VISIBLE);

    }

    public void botonPause(View v){
        videoView.pause();

        imageButton.setVisibility(View.VISIBLE);

        imageButtonPause.setVisibility(View.INVISIBLE);

    }
}