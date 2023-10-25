package com.example.android_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    private ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        lvMain =  findViewById(R.id.lvMainMenu);

        ArrayAdapter<String> newSize = new ArrayAdapter<>(this,
                R.layout.listview_elements_newsize,
                getResources().getStringArray(R.array.Views));
        lvMain.setAdapter(newSize);
        AdapterView.OnItemClickListener ItemClickListner = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0){
                    Intent intent = new Intent(MainMenu.this, com.example.android_layouts.ListView.class);
                    startActivity(intent);
                }
                if (position ==1){
                    Intent intent = new Intent(MainMenu.this, com.example.android_layouts.Frame_Layout.class);
                    startActivity(intent);
                }
                if (position ==2){
                    Intent intent = new Intent(MainMenu.this, com.example.android_layouts.Table_Layout.class);
                    startActivity(intent);
                }
                if (position ==3){
                    Intent intent = new Intent(MainMenu.this, com.example.android_layouts.Constraint_Layout.class);
                    startActivity(intent);
                }
                if (position ==4){
                    Intent intent = new Intent(MainMenu.this, com.example.android_layouts.Relative_Layout.class);
                    startActivity(intent);
                }
            }
        };

        lvMain.setOnItemClickListener(ItemClickListner);


    }
}