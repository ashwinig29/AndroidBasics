package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by ashwir on 2/20/2017.
 */
public class NextActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Log.e(ConfigVariables.log_tag, "onCreateActivity2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ConfigVariables.log_tag, "onStartActivity2");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(ConfigVariables.log_tag, "onResumeActivity2");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(ConfigVariables.log_tag, "onPauseActivity2");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(ConfigVariables.log_tag, "onStopActivity2");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(ConfigVariables.log_tag, "onDestroyActivity2");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(ConfigVariables.log_tag, "onRestartActivity2");

    }

}

