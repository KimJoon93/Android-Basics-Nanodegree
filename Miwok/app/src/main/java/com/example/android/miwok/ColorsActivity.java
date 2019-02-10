package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        // So we could use in onitem click listener
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","lutti",R.drawable.color_black, R.raw.color_black));
        words.add(new Word("Two","ottiko",R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("Three","tolookosu",R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("Four","oyyisa",R.drawable.color_white, R.raw.color_white));
        words.add(new Word("Five","massoka",R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six","temmoka",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight","kawinta",R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine","wo'e",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten","na'aacha",R.drawable.number_ten, R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.colorslist);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
