package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class humorActivity extends AppCompatActivity {

    private Context mContext = humorActivity.this;
    private ListView listView;
    private ArrayAdapter arrayAdapter;
    List<String> items = Arrays.asList(
            "음식 테스트", "내가 산타라면", "크리스마스 케이크 테스트"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humor);

        listView = findViewById(R.id.humor_list);
        arrayAdapter = new ArrayAdapter(mContext, android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(arrayAdapter);

    }
}