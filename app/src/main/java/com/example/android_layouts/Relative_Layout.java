package com.example.android_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Relative_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

       getSupportActionBar().setTitle("Relative Layout");
    }
}