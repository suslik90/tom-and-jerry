package com.romansmekalov.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tomImageView = findViewById(R.id.tomImageView);
        //tomImageView.animate().rotation(180).setDuration(3000);// rotation animation
        //tomImageView.animate().scaleY(0.01f).scaleX(0.01f).rotation(3600).setDuration(3000); // scale x/y animation
//        tomImageView.animate().translationXBy(100).setDuration(3000);// translation animation

    }
    int tomAlpha = 0;
    int jerryAlpha = 1;
    boolean isTomVisible = true;
    float tomScaleY;
    float tomScaleX;
    float jerryScaleY;
    float jerryScaleX;
    int rotationDeg = 3600;
    int duration = 3000;

    public void eraseTom(View view) {

        if(isTomVisible){
            tomScaleY=0;
            tomScaleX=0;
            jerryScaleX = 1;
            jerryScaleY = 1;
        }
        else{
            tomScaleY=1;
            tomScaleX=1;
            jerryScaleX = 0;
            jerryScaleY = 0;
        }

        ImageView tomImageView = findViewById(R.id.tomImageView);
        tomImageView.animate().alpha(tomAlpha).scaleY(tomScaleY).scaleX(tomScaleX).rotation(tomImageView.getRotation()+rotationDeg).setDuration(duration);

        ImageView jerryImageView = findViewById(R.id.jerryImageView);
        jerryImageView.animate().alpha(jerryAlpha).scaleY(jerryScaleY).scaleX(jerryScaleX).rotation(jerryImageView.getRotation()+rotationDeg).setDuration(duration);

    }
}
