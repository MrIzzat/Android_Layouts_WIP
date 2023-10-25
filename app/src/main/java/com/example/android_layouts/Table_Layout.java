package com.example.android_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Field;

public class Table_Layout extends AppCompatActivity {

    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        getSupportActionBar().setTitle("Table Layout");

        setupViews();

        for(int k=0;k<buttons.length;k++){
            int finalK = k;
            buttons[k].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String msg = "Button pressed was: "+ buttons[finalK].getText().toString();
                    Toast.makeText(Table_Layout.this,msg,Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void setupViews() {
        buttons = new Button[8];
        Field field = null;
        Class id = R.id.class;
        String btnID="";
        for(int i=0;i<8;i++){
            btnID = "btn"+(i+1);
            try {
                field = id.getField(btnID);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
            try {
                buttons[i] = findViewById(field.getInt(null));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}