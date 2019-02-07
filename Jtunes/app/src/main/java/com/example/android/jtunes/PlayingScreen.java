package com.example.android.jtunes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_screen);

        TextView songTitle = (TextView)findViewById(R.id.playing_song_title_text);
        TextView singerName = (TextView) findViewById(R.id.playing_singer_name_text);

        final Button playbtn = (Button)findViewById(R.id.playbtn);
        final TextView playingtext = (TextView)findViewById(R.id.playingtext);

        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playbtn.setBackgroundResource(R.drawable.ic_play_button);
                playingtext.setText("Not Playing");
                playingtext.setTextColor(getResources().getColor(R.color.red));
            }
        });

        Intent intent = getIntent();
        String songTitleSet = intent.getStringExtra("SongTitle").toString();
        String singerNameSet = intent.getStringExtra("SingerName").toString();
        songTitle.setText(songTitleSet);
        singerName.setText(singerNameSet);
    }
}
