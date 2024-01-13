package com.hello;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab2 extends Fragment {

    private static final String TAG = "Tab2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        Button dagashiButton = view.findViewById(R.id.dagashi);
        Button danshiButton = view.findViewById(R.id.danshi);
        Button bocchiButton = view.findViewById(R.id.bocchi);


        dagashiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "dagashi button clicked");
                playVideo(R.raw.dagashitrailer);
            }
        });

        danshiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "danshi button clicked");
                playVideo(R.raw.danshitrailer);
            }
        });

        bocchiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "bocchi button clicked");
                playVideo(R.raw.bocchitrailer);
            }
        });

        return view;
    }

    private void playVideo(int videoResource) {
        String videoPath = "android.resource://" + getActivity().getPackageName() + "/" + videoResource;
        Intent intent = new Intent(getActivity(), videoplayer.class);
        intent.putExtra("VIDEO_PATH", videoPath);
        startActivity(intent);
    }
}