package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class colortest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest1);

        Button colortest_1_an1 = (Button) findViewById(R.id.colortest_1_an1);
        Button colortest_1_an2 = (Button) findViewById(R.id.colortest_1_an2);
        Button colortest_1_an3 = (Button) findViewById(R.id.colortest_1_an3);
        Button colortest_1_an4 = (Button) findViewById(R.id.colortest_1_an4);

    }
}