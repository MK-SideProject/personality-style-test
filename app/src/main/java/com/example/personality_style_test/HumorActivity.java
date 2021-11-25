package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HumorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humor);

        ListView humor_list = (ListView)findViewById(R.id.humor_list);
        HumorAdapter adapter = new HumorAdapter();
        adapter.addItem(new HumorItem("호불호테스트", "호불호찾기 테스트","소요시간 : 5분", R.drawable.logo));
        humor_list.setAdapter(adapter);

    }


    class HumorAdapter extends BaseAdapter {
        ArrayList<HumorItem> items = new ArrayList<HumorItem>();

        @Override
        public int getCount(){
            return items.size();
        }

        public void addItem(HumorItem item){
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
            HumorItemView humorItemView = null;
            if(convertView ==null){
                humorItemView = new HumorItemView(getApplicationContext());

            }else{
               humorItemView = (HumorItemView) convertView;
            }
            HumorItem item = items.get(position);
            humorItemView.setHumor_title_resource(item.getHumor_title_resource1());
            humorItemView.setHumordescription_resource(item.getHumor_description_resource1());
            humorItemView.setHumortime_resource(item.getHumor_time_resource1());
            humorItemView.setHumorimg_resource(item.getHumor_img_resource1());
            return humorItemView;
        }
    }
}