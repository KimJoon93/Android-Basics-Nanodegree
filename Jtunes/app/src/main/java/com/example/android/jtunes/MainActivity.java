package com.example.android.jtunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nowplayingsong = (TextView)findViewById(R.id.nowplaying_songtext);

        final ArrayList<SingInfo> singList = new ArrayList<SingInfo>();
        singList.add(new SingInfo("Listen","Jeyonce"));
        singList.add(new SingInfo("mama","papa"));
        singList.add(new SingInfo("nana","gaga"));
        singList.add(new SingInfo("baba","jaja"));
        singList.add(new SingInfo("caca","dada"));
        singList.add(new SingInfo("fafa","zaza"));
        singList.add(new SingInfo("eaea","kaka"));
        singList.add(new SingInfo("eaea","kaka"));
        singList.add(new SingInfo("eaea","kaka"));


        SongListAdapter songListAdapter = new SongListAdapter(this,singList);
        ListView musiclist = (ListView)findViewById(R.id.music_list);
        musiclist.setAdapter(songListAdapter);
        musiclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                nowplayingsong.setText(singList.get(i).getSingTitle());
                Intent intent = new Intent(MainActivity.this, PlayingScreen.class);
                intent.putExtra("SongTitle",singList.get(i).getSingTitle());
                intent.putExtra("SingerName",singList.get(i).getSingerName());
                startActivity(intent);
            }
        });
    }
}
