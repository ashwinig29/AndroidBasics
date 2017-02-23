package com.example.lifecycleacticityanddynamicfragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ashwir on 2/20/2017.
 */
public class FragmentOne extends Fragment {

    public static boolean isFragOneVisible;
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
        isFragOneVisible = true;
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(ConfigVariables.log_tag, "onPauseFragment1");
        isFragOneVisible = false;
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

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        isFragOneVisible = false; //default to not visible
        Log.e(ConfigVariables.log_tag, "setUserVisibleHint1"+isVisibleToUser);
        if (isVisibleToUser) {
            isFragOneVisible = true;
        }
    }
}