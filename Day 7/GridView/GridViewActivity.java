package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {
    GridView gv1;
    String course[] = {"Android", "Php", "Ios", "Angular Js", "Ionic", "Wordpress", "Java", "c#", "Html",
            "C++", "Node Js"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gv1 = findViewById(R.id.gv1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, course);
        gv1.setAdapter(arrayAdapter);
        gv1.setOnItemClickListener(((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(),course[position],Toast.LENGTH_SHORT).show();
        }));
    }
