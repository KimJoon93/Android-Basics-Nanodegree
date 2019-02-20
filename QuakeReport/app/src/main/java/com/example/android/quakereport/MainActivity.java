package com.example.android.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<EarthquakeData> earthquakeData = QueryUtils.extraEarthquakes();

        ListView earthlist = findViewById(R.id.earthlist);
        ListAdapter earthlistadapter = new ListAdapter(this, earthquakeData);
        earthlist.setAdapter(earthlistadapter);
    }
}
