package com.hu.activityandfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "Android4SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "-----onCreate----");
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "-----onStart----");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "-----onRestart----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "-----onResume----");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "-----onPause----");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "-----onStop----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "-----onDestroy----");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i(TAG, "-----onBackPressed----");
    }
}
