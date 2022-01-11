package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class FavoritesActivity extends AppCompatActivity {


    ListView favoritesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        favoritesListView = (ListView) findViewById(R.id.favListView);

        TextView v = (TextView) findViewById(R.id.textView12);

//        favoritesListView.addView(v);






    }
}