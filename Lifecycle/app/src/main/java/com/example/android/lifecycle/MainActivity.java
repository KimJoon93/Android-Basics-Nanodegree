package com.example.android.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST","onDestroy");
    }
}
