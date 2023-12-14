package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class EaringActivity extends AppCompatActivity {

    LinearLayout eyes,nose,ear,mouth,lips,teeth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earing);

        eyes = findViewById(R.id.computer);
        nose = findViewById(R.id.cpu);
        ear = findViewById(R.id.mouse);
        mouth = findViewById(R.id.keyboard);
        lips = findViewById(R.id.monitor);
        teeth = findViewById(R.id.ram);



       eyes .setOnClickListener(view -> {

            Intent intent = new Intent(EaringActivity.this,PlaceorderActivity2.class);

            startActivity(intent);

        });


       nose .setOnClickListener(view -> {

            Intent intent = new Intent(EaringActivity.this,PlaceorderActivity2.class);

            startActivity(intent);

        });
        ear .setOnClickListener(view -> {

            Intent intent = new Intent(EaringActivity.this,PlaceorderActivity2 .class);

            startActivity(intent);

        });

        mouth.setOnClickListener(view -> {

            Intent intent = new Intent(EaringActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
       lips .setOnClickListener(view -> {

            Intent intent = new Intent(EaringActivity.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        teeth.setOnClickListener(view -> {

            Intent intent = new Intent(EaringActivity.this,PlaceorderActivity2.class);

            startActivity(intent);

        });


    }
}