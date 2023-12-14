package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlaceorderActivity2 extends AppCompatActivity {
    Button place;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeorder2);


        place = findViewById(R.id.btn_placeorder);//initialization
        place.setOnClickListener(view -> {
            Intent intent = new Intent(PlaceorderActivity2.this, finalActvity.class);
            startActivity(intent);
        });
    }
}
