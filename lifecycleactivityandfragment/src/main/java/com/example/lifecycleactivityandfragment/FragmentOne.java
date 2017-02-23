package com.example.lifecycleactivityandfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by ashwir on 2/17/2017.
 */

public class FragmentOne extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(ConfigVariables.log_tag, "onAttachFragment1");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(ConfigVariables.log_tag, "onCreateFragment1");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(ConfigVariables.log_tag, "onCraeteViewFragment1");
        super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.fragment_one,null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(ConfigVariables.log_tag, "onActivityCreatedFragment1");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(ConfigVariables.log_tag, "onStartFragment1");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(ConfigVariables.log_tag, "onResumeFragment1");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(ConfigVariables.log_tag, "onPauseFragment1");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(ConfigVariables.log_tag, "onStopFragment1");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(ConfigVariables.log_tag, "onDestroyViewFragment1");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(ConfigVariables.log_tag, "onDestroyFragment1");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(ConfigVariables.log_tag, "onDetachFragment1");
    }
}
