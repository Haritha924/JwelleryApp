package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ThreadjwelleryActivity2 extends AppCompatActivity {

    LinearLayout jimikke_ll,tasle_ll,chain1_ll,chain2_ll,bangle1_ll,bangle2_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threadjwellery2);

        jimikke_ll =findViewById(R.id.ll_tree);
        tasle_ll =findViewById(R.id.ll_leaves);
        chain1_ll=findViewById(R.id.ll_fruit);
        chain2_ll=findViewById(R.id.ll_flower);
        bangle1_ll=findViewById(R.id.ll_root);
        bangle2_ll =findViewById(R.id.ll_stem);



        jimikke_ll.setOnClickListener(view -> {

            Intent intent = new Intent(ThreadjwelleryActivity2.this, PlaceorderActivity2.class);

            startActivity(intent);

        });


        tasle_ll.setOnClickListener(view -> {

            Intent intent = new Intent(ThreadjwelleryActivity2.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        chain1_ll.setOnClickListener(view -> {

            Intent intent = new Intent(ThreadjwelleryActivity2.this,PlaceorderActivity2 .class);

            startActivity(intent);

        });

        chain2_ll.setOnClickListener(view -> {

            Intent intent = new Intent(ThreadjwelleryActivity2.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        bangle1_ll.setOnClickListener(view -> {

            Intent intent = new Intent(ThreadjwelleryActivity2.this, PlaceorderActivity2.class);

            startActivity(intent);

        });
        bangle2_ll.setOnClickListener(view -> {

            Intent intent = new Intent(ThreadjwelleryActivity2.this, PlaceorderActivity2.class);

            startActivity(intent);

        });





    }
}
