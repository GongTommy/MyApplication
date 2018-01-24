package com.example.administrator.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018\1\23 0023.
 */

public class MainFragment extends Fragment {
    private String TAG = "MainFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.item, null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "oncreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onstart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onstop");
    }
}
