package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest6);

        Button exercisetest_6_an1 = (Button) findViewById(R.id.exercisetest_6_an1);
        Button exercisetest_6_an2 = (Button) findViewById(R.id.exercisetest_6_an2);
        Button exercisetest_6_an3 = (Button) findViewById(R.id.exercisetest_6_an3);
        Button exercisetest_6_an4 = (Button) findViewById(R.id.exercisetest_6_an4);
    }
}