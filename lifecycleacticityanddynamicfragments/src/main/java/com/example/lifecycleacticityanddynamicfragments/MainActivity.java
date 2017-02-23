package com.example.lifecycleacticityanddynamicfragments;

import android.app.Fragment;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fragmentone).setOnClickListener(this);
        findViewById(R.id.fragmenttwo).setOnClickListener(this);
        Log.e(ConfigVariables.log_tag, "onCreateActivity");

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.add(R.id.fragment_container, new FragmentOne());
        ft.commit();

    }

    @Override
    public void onClick(View v) {
        //Fragment currentFragment = getFragmentManager().findFragmentById(R.id.fragment_container);

        ft = fm.beginTransaction();
        switch (v.getId()){
            case R.id.fragmentone:
                if(!FragmentOne.isFragOneVisible)
                    ft.replace(R.id.fragment_container, new FragmentOne());
                break;
            case R.id.fragmenttwo:
                if(!FragmentTwo.isFragTwoVisible)
                ft.replace(R.id.fragment_container, new FragmentTwo());
                break;
        }
        ft.commit();
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
