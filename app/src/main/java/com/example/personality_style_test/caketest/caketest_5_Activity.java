package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class caketest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest5);

        Button caketest_5_an1 = (Button) findViewById(R.id.caketest_5_an1);
        Button caketest_5_an2 = (Button) findViewById(R.id.caketest_5_an2);
        Button caketest_5_an3 = (Button) findViewById(R.id.caketest_5_an3);
    }
}