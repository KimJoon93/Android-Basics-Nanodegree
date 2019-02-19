package com.example.android.seoultourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

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
        int geti = intent.getIntExtra("geti",0);

        titleText.setText(enjoyTitle);
        enjoyContentimg.setImageResource(enjoyImgId);

        final ArrayList<ContentData> contentList = new ArrayList<>();
        contentList.add(new ContentData("South seoul ...", "02-000-0000","This place is ~~~"));
        contentList.add(new ContentData("South seoul ...", "02-000-0000","This place is ~~~"));
        contentList.add(new ContentData("South seoul ...", "02-000-0000","This place is ~~~"));
        contentList.add(new ContentData("South seoul ...", "02-000-0000","This place is ~~~"));
        contentList.add(new ContentData("South seoul ...", "02-000-0000","This place is ~~~"));

        TextView adressText = findViewById(R.id.adressText);
        TextView numberText = findViewById(R.id.nuberText);
        TextView contentText = findViewById(R.id.contentText);

        adressText.setText(contentList.get(geti).getAdress());
        numberText.setText(contentList.get(geti).getNumber());
        contentText.setText(contentList.get(geti).getContent());
    }
}
