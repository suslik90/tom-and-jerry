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
        tomImageView.animate().rotation(180).setDuration(3000);

    }
    int tomAlpha = 0;
    int jerryAlpha = 1;
    boolean isTomVisible = true;

    public void eraseTom(View view) {

        if(isTomVisible){
            tomAlpha = 0;
            jerryAlpha = 1;
            isTomVisible = false;
        }
        else{
            tomAlpha = 1;
            jerryAlpha = 0;
            isTomVisible = true;
        }

        ImageView tomImageView = findViewById(R.id.tomImageView);
        tomImageView.animate().alpha(tomAlpha).setDuration(3000);

        ImageView jerryImageView = findViewById(R.id.jerryImageView);
        jerryImageView.animate().alpha(jerryAlpha).setDuration(3000);

    }
}
