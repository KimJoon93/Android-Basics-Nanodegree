package com.example.android.jtunes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SingInfo> singList = new ArrayList<SingInfo>();
        singList.add(new SingInfo("Listen","Jeyonce"));
        singList.add(new SingInfo("mama","papa"));
        singList.add(new SingInfo("nana","gaga"));

        SongListAdapter songListAdapter = new SongListAdapter(this,singList);
        ListView musiclist = (ListView)findViewById(R.id.music_list);
        musiclist.setAdapter(songListAdapter);

    }
}
