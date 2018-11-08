package com.superman.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    MyGridview myGridview;
    ArrayAdapter mAdapter;
    String[] str = {"郑州", "焦作", "新乡", "许昌", "郑州", "焦作", "新乡", "许昌", "郑州",
            "焦作", "新乡", "许昌", "郑州", "焦作", "新乡", "许昌", "郑州", "焦作", "新乡", "许昌", "郑州"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGridview = findViewById(R.id.grid);
        myGridview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str));
    }
}
