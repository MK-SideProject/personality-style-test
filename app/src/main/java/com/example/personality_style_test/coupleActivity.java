package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class coupleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couple);

        Button couple_input_button = findViewById(R.id.couple_input_button);
        ImageView imageView_mbti_result = findViewById(R.id.imageView_mbti_result);
        TextView couple_mbti_result_text = findViewById(R.id.couple_mbti_result_text);
        TextInputEditText couple_input_text = findViewById(R.id.couple_input_text);

        //버튼을 누를때, 텍스트뷰 글씨 변경, 이미지뷰 결과화면 변경

        couple_input_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                

            }
        });
    }
}