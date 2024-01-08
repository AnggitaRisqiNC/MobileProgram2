package com.hello.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.hello.R;

public class TabFragment3 extends Fragment {

    private static final String TAG = "TabFragment3";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.activity_tab3, container, false);

        View btnUnlocked = view.findViewById(R.id.Unlocked);
        btnUnlocked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Unlocked.class);
                startActivity(intent);
            }
        });

        View btnMask = view.findViewById(R.id.Mask);
        btnMask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaskGirl.class);
                startActivity(intent);
            }
        });

        View btnCelebrity = view.findViewById(R.id.Celebrity);
        btnCelebrity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Celebrity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
