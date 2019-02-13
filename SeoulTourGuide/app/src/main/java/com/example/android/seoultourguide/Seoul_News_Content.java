package com.example.android.seoultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Seoul_News_Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seoul__news__content);

        Intent intent = getIntent();
        String newsTitle = intent.getStringExtra("newsTitle");
        String newsBody = intent.getStringExtra("newsBody");
        int imgId = intent.getIntExtra("newsImg",0);

        TextView contentTitle = (TextView)findViewById(R.id.content_titletext);
        TextView contentBody = (TextView)findViewById(R.id.content_bodytext);
        ImageView contentImg = (ImageView)findViewById(R.id.content_imgid);

        contentTitle.setText(newsTitle);
        contentBody.setText(newsBody);
        contentImg.setImageResource(imgId);
    }
}
