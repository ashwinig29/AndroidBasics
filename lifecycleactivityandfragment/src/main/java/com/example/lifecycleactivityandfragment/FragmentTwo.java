package com.example.lifecycleactivityandfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ashwir on 2/17/2017.
 */

public class FragmentTwo extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(ConfigVariables.log_tag, "onAttachFragment2");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(ConfigVariables.log_tag, "onCreateFragment2");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(ConfigVariables.log_tag, "onCraeteViewFragment2");
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_two,null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(ConfigVariables.log_tag, "onActivityCreatedFragment2");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(ConfigVariables.log_tag, "onStartFragment2");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(ConfigVariables.log_tag, "onResumeFragment2");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(ConfigVariables.log_tag, "onPauseFragment2");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(ConfigVariables.log_tag, "onStopFragment2");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(ConfigVariables.log_tag, "onDestroyViewFragment2");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(ConfigVariables.log_tag, "onDestroyFragment2");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(ConfigVariables.log_tag, "onDetachFragment2");
    }
}
