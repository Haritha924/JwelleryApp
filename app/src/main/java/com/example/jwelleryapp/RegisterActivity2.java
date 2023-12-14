package com.example.jwelleryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity2 extends AppCompatActivity {

    EditText nameEt,mobileNumberEt,addressEt;

    Button submitBtn;

    String strName = "Haritha",strMobileNumber = "123456789", strAddress = "Chennai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        nameEt = findViewById(R.id.et_register_name);
        mobileNumberEt = findViewById(R.id.et_register_mob_no);
        addressEt = findViewById(R.id.et_register_address);
        submitBtn = findViewById(R.id.btn_submit);
        submitBtn.setOnClickListener(view -> {
            Intent intent=new Intent(RegisterActivity2.this,MainActivity.class);
            startActivity(intent);
        });






           }
}
