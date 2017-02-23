package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(ConfigVariables.log_tag, "onCreateActivity");

        findViewById(R.id.btn_next_act).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NextActivity.class));
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ConfigVariables.log_tag, "onStartActivity");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(ConfigVariables.log_tag, "onResumeActivity");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(ConfigVariables.log_tag, "onPauseActivity");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(ConfigVariables.log_tag, "onStopActivity");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(ConfigVariables.log_tag, "onDestroyActivity");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(ConfigVariables.log_tag, "onRestartActivity");

    }

}
