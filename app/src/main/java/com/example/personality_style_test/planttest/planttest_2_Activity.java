package com.example.personality_style_test.planttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class planttest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planttest2);

        Button planttest_2_an1 = (Button) findViewById(R.id.planttest_2_an1);
        Button planttest_2_an2 = (Button) findViewById(R.id.planttest_2_an2);
        Button planttest_2_an3 = (Button) findViewById(R.id.planttest_2_an3);

    }
}