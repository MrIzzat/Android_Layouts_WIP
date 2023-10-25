package com.example.android_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class ListView extends AppCompatActivity {

    private android.widget.ListView lvDynamically;
    private android.widget.ListView lvStatically;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setTitle("List View");
        getSupportActionBar().setSubtitle("Hey bro");

        setupViews();

        AdapterView.OnItemClickListener StaticItemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position ==0){
                    Toast.makeText(ListView.this,"Item chosen: First element",Toast.LENGTH_SHORT).show();
                }
                if(position ==1){
                    Toast.makeText(ListView.this,"Item chosen: Second element",Toast.LENGTH_SHORT).show();
                }
                if(position ==2){
                    Toast.makeText(ListView.this,"Item chosen: Third element",Toast.LENGTH_SHORT).show();
                }

            }
        };
        lvStatically.setOnItemClickListener(StaticItemListener);
        String[] str = {"Item 1d","Item 2d","Item 3d"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,str);

        lvDynamically.setAdapter(adapter);

        AdapterView.OnItemClickListener DynamicItemListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView.this,"Item chosen:"+str[(int)id],Toast.LENGTH_SHORT).show();


            }
        };

        lvDynamically.setOnItemClickListener(DynamicItemListener);

    }

    private void setupViews() {
        lvDynamically = findViewById(R.id.lvDynamic);
        lvStatically = findViewById(R.id.lvStatic);
    }
}