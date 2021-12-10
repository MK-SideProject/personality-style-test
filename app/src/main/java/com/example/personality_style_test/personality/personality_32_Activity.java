package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_32_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality32);

        Button personality_32_yes = (Button) findViewById(R.id.personality_32_yes);
        Button personality_32_no = (Button) findViewById(R.id.personality_32_no);

    }
}