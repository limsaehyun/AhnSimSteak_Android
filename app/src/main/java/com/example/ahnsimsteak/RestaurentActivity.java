package com.example.ahnsimsteak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RestaurentActivity extends AppCompatActivity {

    private ImageButton korean, sushi, jjajangmyeon, pasta, hamburger, tteok, mix, coffee,rank, map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurent);

        korean = (ImageButton) findViewById(R.id.korean);
        sushi = (ImageButton) findViewById(R.id.sushi);
        jjajangmyeon = (ImageButton) findViewById(R.id.jjajangmyeon);
        pasta = (ImageButton) findViewById(R.id.pasta);
        hamburger = (ImageButton) findViewById(R.id.hamburger);
        tteok = (ImageButton) findViewById(R.id.tteok);
        mix = (ImageButton) findViewById(R.id.mix);
        map = (ImageButton) findViewById(R.id.map);
        rank = (ImageButton) findViewById(R.id.rank);

        korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, KoreanActivity.class));
            }
        });

        sushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, JapanActivity.class));
            }
        });

        jjajangmyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, ChinaActivity.class));
            }
        });

        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, EuropeActivity.class));
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, FastFoodActivity.class));
            }
        });

        tteok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, BunsickActivity.class));
            }
        });

        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, DessertActivity.class));
            }
        });



        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, ToptenActivity.class));
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RestaurentActivity.this, MapActivity.class));
            }
        });
    }

}