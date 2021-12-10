package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_40_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality40);

        Button personality_40_yes = (Button) findViewById(R.id.personality_40_yes);
        Button personality_40_no = (Button) findViewById(R.id.personality_40_no);

        personality_40_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39 = getIntent();
                Bundle bundle = intent39.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent40 = new Intent(getBaseContext(), personality_40_Activity.class);
                intent40.putExtra("e", e);
                intent40.putExtra("i", i);
                intent40.putExtra("n", n);
                intent40.putExtra("s", s);
                intent40.putExtra("f", f);
                intent40.putExtra("t", t);
                intent40.putExtra("p", p);
                intent40.putExtra("j", j);

                startActivity(intent40);

            }
        });

        personality_40_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39 = getIntent();
                Bundle bundle = intent39.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent40 = new Intent(getBaseContext(), personality_40_Activity.class);
                intent40.putExtra("e", e);
                intent40.putExtra("i", i);
                intent40.putExtra("n", n);
                intent40.putExtra("s", s);
                intent40.putExtra("f", f);
                intent40.putExtra("t", t);
                intent40.putExtra("p", p);
                intent40.putExtra("j", j);

                startActivity(intent40);

            }
        });

    }
}