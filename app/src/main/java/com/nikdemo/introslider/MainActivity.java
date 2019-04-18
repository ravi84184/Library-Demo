package com.nikdemo.introslider;

import android.app.ListActivity;
import android.app.Service;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nikdemo.introslider.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager imageViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewPager = findViewById(R.id.imageViewPager);
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("One 1");
        list.add("One 2");
        list.add("One 3");
        setUpImageViewPager(list);
    }

    private void setUpImageViewPager(List<String> list) {
        imageViewPager.setAdapter(new MyViewPagerAdapter(this,list));
    }
}
