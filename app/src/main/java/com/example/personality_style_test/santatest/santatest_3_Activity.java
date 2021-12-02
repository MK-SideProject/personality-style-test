package com.example.personality_style_test.santatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class santatest_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santatest3);

        Button santatest_3_an1 = (Button) findViewById(R.id.santatest_3_an1);
        Button santatest_3_an2 = (Button) findViewById(R.id.santatest_3_an2);
        Button santatest_3_an3 = (Button) findViewById(R.id.santatest_3_an3);

    }
}