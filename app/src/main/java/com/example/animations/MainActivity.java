package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartisshowing = true;

    public void fade(View view){

        Log.i("Info","Image Tapped!");

        ImageView bartimageView = (ImageView) findViewById(R.id.imageView3);
        ImageView homerimageView = (ImageView) findViewById(R.id.imageView4);

        if(bartisshowing){
            bartisshowing = false;
            bartimageView.animate().alpha(0).setDuration(2000);
            homerimageView.animate().alpha(1).setDuration(2000);
        }
        else{
            bartisshowing = true;
            bartimageView.animate().alpha(1).setDuration(2000);
            homerimageView.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
