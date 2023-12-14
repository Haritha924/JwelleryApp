package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MenuActivity2 extends AppCompatActivity {

    LinearLayout typesjewllery_ll,beats_ll,earing_ll,bangles_ll,contact_ll,about_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        typesjewllery_ll = findViewById(R.id.ll_typesjewllery);
        beats_ll = findViewById(R.id.llbeats);
        earing_ll = findViewById(R.id.ll_earing);
        bangles_ll = findViewById(R.id.ll_bangles);
        contact_ll = findViewById(R.id.ll_contact);
        about_ll = findViewById(R.id.ll_about);



        typesjewllery_ll .setOnClickListener(view -> {

            Intent intent = new Intent(MenuActivity2.this, ThreadjwelleryActivity2.class);

            startActivity(intent);

        });


        beats_ll .setOnClickListener(view -> {

            Intent intent = new Intent(MenuActivity2.this, BeatsActivity.class);

            startActivity(intent);

        });
        earing_ll .setOnClickListener(view -> {

            Intent intent = new Intent(MenuActivity2.this,EaringActivity .class);

            startActivity(intent);

        });

        bangles_ll.setOnClickListener(view -> {

            Intent intent = new Intent(MenuActivity2.this, BanglesActivity.class);

            startActivity(intent);

        });
        contact_ll .setOnClickListener(view -> {

            Intent intent = new Intent(MenuActivity2.this, ContactActivity2.class);

            startActivity(intent);

        });
        about_ll.setOnClickListener(view -> {

            Intent intent = new Intent(MenuActivity2.this, AboutActivity2.class);

            startActivity(intent);

        });





    }
}