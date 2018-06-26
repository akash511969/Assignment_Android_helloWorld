package com.example.user.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activitystate","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activitystate","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activitystate","onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activitystate","onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activitystate","onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activitystate","onPause()");
    }
}
