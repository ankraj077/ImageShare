package com.example.arajput9656.imageshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView imageView;
    Button button_get_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageView = (ImageView)findViewById(R.id.imageView);
        button_get_image = (Button)findViewById(R.id.button_get_image);
    }

    public void getImage(View view){

    }
}
