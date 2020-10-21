package com.example.assign3lhm;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] names = AndroidVersions.names();
    String[] urls = AndroidVersions.urls();
    String[] descriptions = AndroidVersions.descriptions();
    int[] images = AndroidVersions.images();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ImageAdapter adapter = new ImageAdapter(this, images, names, urls, descriptions);
        listView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}