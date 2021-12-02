package com.example.personality_style_test.bankingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class bankingtest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankingtest5);

        Button bankingtest_5_an1 = (Button) findViewById(R.id.bankingtest_5_an1);
        Button bankingtest_5_an2 = (Button) findViewById(R.id.bankingtest_5_an2);
        Button bankingtest_5_an3 = (Button) findViewById(R.id.bankingtest_5_an3);
        Button bankingtest_5_an4 = (Button) findViewById(R.id.bankingtest_5_an4);
    }
}