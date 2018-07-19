package com.cheng.commonadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView simple_lv = findViewById(R.id.simple_lv);
        SimpleAdapter adapter = new SimpleAdapter(this, getData());
        simple_lv.setAdapter(adapter);
        ListView simple_lv2 = findViewById(R.id.simple_lv2);
        SimpleMutiAdapter adapter2 = new SimpleMutiAdapter(this, getData());
        simple_lv2.setAdapter(adapter2);
    }

    private List<String> getData(){
        List<String> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add("i = " + i);
        }
        return lists;
    }

}
