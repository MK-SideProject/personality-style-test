package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class colortest_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest3);

        Button colortest_3_an1 = (Button) findViewById(R.id.colortest_3_an1);
        Button colortest_3_an2 = (Button) findViewById(R.id.colortest_3_an2);
        Button colortest_3_an3 = (Button) findViewById(R.id.colortest_3_an3);
        Button colortest_3_an4 = (Button) findViewById(R.id.colortest_3_an4);
    }
}