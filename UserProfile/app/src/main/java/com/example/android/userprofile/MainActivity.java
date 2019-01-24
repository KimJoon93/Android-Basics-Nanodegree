package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView profile_picture  = (ImageView)findViewById(R.id.profile_picture);
        TextView name = (TextView)findViewById(R.id.name);
        profile_picture.setImageResource(R.drawable.androidparty);
        name.setText("Joon");
    }
}
