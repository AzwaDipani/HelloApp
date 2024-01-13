package com.hello;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab3 extends Fragment {

    private static final String TAG = "Tab2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        Button koiButton = view.findViewById(R.id.koi);
        Button horiButton = view.findViewById(R.id.hori);
        Button wotakoiButton = view.findViewById(R.id.wotakoi);

        // Set click listener for each button
        koiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "koi button clicked");
                playVideo(R.raw.koitrailer);
            }
        });

        horiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "hori button clicked");
                playVideo(R.raw.horitrailer);
            }
        });

        wotakoiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "wotakoi button clicked");
                playVideo(R.raw.wotakoitrailer);
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