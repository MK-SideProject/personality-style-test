package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.personality.personalitytest_Activity;

public class MainActivity extends AppCompatActivity {

    private BackKeyClickHandler backKeyClickHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backKeyClickHandler = new BackKeyClickHandler();

        Button personality = (Button)findViewById(R.id.personality);
        Button humor = (Button)findViewById(R.id.humor);
        Button mbtiTest = (Button)findViewById(R.id.mbtiTest);
        Button couple = (Button)findViewById(R.id.couple);

        personality.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), PersonalityActivity.class);
                startActivity(intent);
            }
        });


        humor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), HumorActivity.class);
                startActivity(intent);
            }
        });

        mbtiTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), personalitytest_Activity.class);
                startActivity(intent);
            }
        });

        couple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), coupleActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override public void onBackPressed() {
        super.onBackPressed();
        backKeyClickHandler.onBackPressed();
    }


}