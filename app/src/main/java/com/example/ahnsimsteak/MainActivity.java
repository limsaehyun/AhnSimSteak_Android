package com.example.ahnsimsteak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.OnMapReadyCallback;

import noman.googleplaces.PlacesListener;

public class MainActivity extends AppCompatActivity {

    private ImageButton restaurent, gitar, ib_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib_map = (ImageButton) findViewById(R.id.ib_map);
        ib_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MapActivity.class));
            }
        });

        restaurent = (ImageButton) findViewById(R.id.restaurent);
        gitar = (ImageButton) findViewById(R.id.gitar);

        restaurent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RestaurentActivity.class));
            }
        });
    }
}