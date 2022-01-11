package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
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

        infoButton = findViewById(R.id.infoButton);





        favButton.setOnClickListener(favButtonListener);

        infoButton.setOnClickListener(infoButtonListener);

    }

    View.OnClickListener favButtonListener = new View.OnClickListener() {

        public void onClick(View v) {

            Intent i = new Intent(MainActivity.this, FavoritesActivity.class);
            startActivity(i);



        }
    };


    View.OnClickListener infoButtonListener = new View.OnClickListener() {

        public void onClick(View v) {


            runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (!isFinishing()){
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Info")
                                .setMessage("Alunos: Marlon, Pedro Hugo, Antony")
                                .setCancelable(false)
                                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Uri uri = Uri.parse("https://github.com/marlonsecundo/weather-app/"); // missing 'http://' will cause crashed
                                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                        startActivity(intent);

                                    }
                                }).setNegativeButton(
                                "Sair",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                }).show();
                    }
                }
            });



        }
    };




}