package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_7_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality7);

        Button personality_7_yes = (Button) findViewById(R.id.personality_7_yes);
        Button personality_7_no = (Button) findViewById(R.id.personality_7_no);
    }
}