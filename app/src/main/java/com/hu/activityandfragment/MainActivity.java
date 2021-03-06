package com.hu.activityandfragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Android4MainActivity";
    android.app.FragmentManager manager = getFragmentManager();
    android.app.FragmentTransaction transaction = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "-----onCreate----");
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.add(R.id.container, new MyFragment(), "MyFragment");
                transaction.commit();

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
//                Fragment fragment = manager.findFragmentByTag("MyFragment");
                Fragment fragment = manager.findFragmentById(R.id.container);
                transaction.remove(fragment);
                transaction.commit();

            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                transaction = manager.beginTransaction();
                transaction.replace(R.id.container, new SecondFragment());
                transaction.commit();

            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "-----onRestoreInstanceState----");
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
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "-----onSaveInstanceState----");
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
