package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BanglesActivity extends AppCompatActivity {

    LinearLayout tangle,brace,ban,stone,set,trade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangles);

        tangle = findViewById(R.id.head);
        brace= findViewById(R.id.hair);
        ban = findViewById(R.id.mask);
        stone= findViewById(R.id.shampoo);
        set= findViewById(R.id.conditionar);
        trade = findViewById(R.id.serum);



       tangle .setOnClickListener(view -> {

            Intent intent = new Intent(BanglesActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });


        brace .setOnClickListener(view -> {

            Intent intent = new Intent(BanglesActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        ban .setOnClickListener(view -> {

            Intent intent = new Intent(BanglesActivity.this,PlaceorderActivity2 .class);

            startActivity(intent);

        });

       stone.setOnClickListener(view -> {

            Intent intent = new Intent(BanglesActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        stone .setOnClickListener(view -> {

            Intent intent = new Intent(BanglesActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        trade.setOnClickListener(view -> {

            Intent intent = new Intent(BanglesActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });


    }
}