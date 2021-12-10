package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_25_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality25);

        Button personality_25_yes = (Button) findViewById(R.id.personality_25_yes);
        Button personality_25_no = (Button) findViewById(R.id.personality_25_no);

    }
}