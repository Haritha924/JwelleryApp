package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BeatsActivity extends AppCompatActivity {

    LinearLayout greenchain,redchain,silverchain,goldchain,setchain,longchain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beats);

        greenchain= findViewById(R.id.pencil);
        redchain = findViewById(R.id.pen);
        silverchain = findViewById(R.id.eraser);
        goldchain= findViewById(R.id.sharpner);
        setchain = findViewById(R.id.scale);
        longchain= findViewById(R.id.pouch);



        greenchain.setOnClickListener(view -> {

            Intent intent = new Intent(BeatsActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });


        redchain.setOnClickListener(view -> {

            Intent intent = new Intent(BeatsActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        silverchain.setOnClickListener(view -> {

            Intent intent = new Intent(BeatsActivity.this,PlaceorderActivity2 .class);

            startActivity(intent);

        });

        goldchain.setOnClickListener(view -> {

            Intent intent = new Intent(BeatsActivity.this,PlaceorderActivity2.class);

            startActivity(intent);

        });
        setchain .setOnClickListener(view -> {

            Intent intent = new Intent(BeatsActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        longchain.setOnClickListener(view -> {

            Intent intent = new Intent(BeatsActivity.this,PlaceorderActivity2.class);

            startActivity(intent);

        });



    }
}