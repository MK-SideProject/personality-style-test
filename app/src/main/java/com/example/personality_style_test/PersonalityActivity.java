package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PersonalityActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        ListView listView = (ListView)findViewById(R.id.listView);
        PersonalityAdapter adapter = new PersonalityAdapter();
        adapter.addItem(new PersonalityItem("컬러테스트", "색깔을 통해 나의 유형을 찾아가는 테스트","소요시간 : 5분", R.drawable.logo));
        listView.setAdapter(adapter);




    }

    class PersonalityAdapter extends BaseAdapter{
        ArrayList<PersonalityItem> items = new ArrayList<PersonalityItem>();

        @Override
        public int getCount(){
            return items.size();
        }

        public void addItem(PersonalityItem item){
            items.add(item);
        }

        @Override
        public Object getItem(int poition){
            return  items.get(poition);
        }

        @Override
        public long getItemId(int position){
            return position;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            PersonalityItemView personalityItemView = null;
            if(convertView ==null){
                personalityItemView = new PersonalityItemView(getApplicationContext());

            }else{
                personalityItemView = (PersonalityItemView)convertView;
            }
            PersonalityItem item = items.get(position);
            personalityItemView.setTitle_resource1(item.getTitle_resource1());
            personalityItemView.setDescription_resource1(item.getDescription_resource1());
            personalityItemView.setTime_resource1(item.getTime_resource1());
            personalityItemView.setImg_resource1(item.getImg_resource1());
            return personalityItemView;
        }
    }
}