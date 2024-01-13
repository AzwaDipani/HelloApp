package com.hello;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab1 extends Fragment {

    private static final String TAG = "Tab1";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        // Find the button by its ID
        Button jigokurakuButton = view.findViewById(R.id.jigokuraku);
        Button nierButton = view.findViewById(R.id.nierautomata);
        Button deButton = view.findViewById(R.id.dp);

        // Set click listener for each button
        jigokurakuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Jigokuraku button clicked");
                playVideo(R.raw.jigokutrailer);
            }
        });

        nierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "nier button clicked");
                playVideo(R.raw.niertrailer);
            }
        });

        deButton.setOnClickListener(new View.OnClickListener() {
            @Override
                        public void onClick(View v) {
                Log.d(TAG, "de button clicked");
                playVideo(R.raw.detrailer);
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
