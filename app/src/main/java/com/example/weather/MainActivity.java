package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button favButton;
    Button exitButton;
    Button infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favButton = findViewById(R.id.favButton);

        favButton.setOnClickListener(favButtonListener);
    }

    View.OnClickListener favButtonListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent i = new Intent(MainActivity.this, FavoritesActivity.class);
            startActivity(i);



        }
    };



}