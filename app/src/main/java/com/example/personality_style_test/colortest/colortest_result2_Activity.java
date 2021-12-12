package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.MainActivity;
import com.example.personality_style_test.R;

public class colortest_result2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest_result2);

        Button colortest_restart = (Button) findViewById(R.id.colortest_restart);
        Button colortest_list = (Button) findViewById(R.id.colortest_list);


        colortest_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), colortest_1_Activity.class);
                startActivity(intent);
            }
        });
        colortest_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}