package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class triptest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest2);

        Button triptest_2_an1 = (Button) findViewById(R.id.triptest_2_an1);
        Button triptest_2_an2 = (Button) findViewById(R.id.triptest_2_an2);
        Button triptest_2_an3 = (Button) findViewById(R.id.triptest_2_an3);

    }
}