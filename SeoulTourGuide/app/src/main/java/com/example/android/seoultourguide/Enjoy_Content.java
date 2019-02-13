package com.example.android.seoultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Enjoy_Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enjoy__content);

        TextView titleText = (TextView)findViewById(R.id.enjoy_content_title);
        ImageView enjoyContentimg = (ImageView)findViewById(R.id.enjoy_content_imgid);

        Intent intent = getIntent();
        String enjoyTitle = intent.getStringExtra("enjoy_Title");
        int enjoyImgId = intent.getIntExtra("enjoy_imgid",0);

        titleText.setText(enjoyTitle);
        enjoyContentimg.setImageResource(enjoyImgId);
    }
}
