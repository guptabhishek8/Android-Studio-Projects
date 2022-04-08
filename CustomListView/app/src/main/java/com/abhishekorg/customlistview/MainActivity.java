package com.abhishekorg.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
String name[] = {"Rohan", "Rajesh", "Rakesh"};
Integer image[] = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.list);
        CustomList cs = new CustomList(MainActivity.this, name, image);
        listView.setAdapter(cs);

    }
}