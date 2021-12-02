package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest1);

        Button exercisetest_1_an1 = (Button) findViewById(R.id.exercisetest_1_an1);
        Button exercisetest_1_an2 = (Button) findViewById(R.id.exercisetest_1_an2);
        Button exercisetest_1_an3 = (Button) findViewById(R.id.exercisetest_1_an3);

    }
}