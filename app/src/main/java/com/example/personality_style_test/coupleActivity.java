package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class coupleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couple);

        Button couple_input_button = (Button) findViewById(R.id.couple_input_button);
        ImageView imageView_mbti_result = (ImageView) findViewById(R.id.imageView_mbti_result);
        TextView couple_mbti_result_text = (TextView) findViewById(R.id.couple_mbti_result_text);
        EditText couple_input_text = (EditText) findViewById(R.id.couple_input_text);

        //버튼을 누를때, 텍스트뷰 글씨 변경, 이미지뷰 결과화면 변경

        couple_input_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mbti = couple_input_text.getText().toString();
                mbti  = mbti.toUpperCase();

//                if (mbti.length() == 0 ) {
//                        //공백일 때 처리할 내용
//                    Toast.makeText(getApplicationContext(), "값을 입력해서 눌러주세요.",Toast.LENGTH_SHORT).show();
//
//                }
                if( mbti == "ENTJ" ) {
                    //텍스트 뷰 전환해주기
                    couple_mbti_result_text.setText("ENTJ와 어울리는 궁합은");
                    // 이미지 뷰 결과화면 변경
                    Drawable drawable = getResources().getDrawable(R.drawable.couple_entj);
                    imageView_mbti_result.setImageDrawable(drawable);

                }

            }
        });
    }
}