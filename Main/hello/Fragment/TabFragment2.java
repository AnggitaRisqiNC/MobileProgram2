package com.hello.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hello.R;

public class TabFragment2 extends Fragment {

    private static final String TAG = "TabFragment2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.activity_tab2, container, false);

        View btnBallerina = view.findViewById(R.id.Ballerina);
        btnBallerina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Ballerina.class);
                startActivity(intent);
            }
        });

        View btnBlack = view.findViewById(R.id.Black);
        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BlackKnight.class);
                startActivity(intent);
            }
        });

        View btnName = view.findViewById(R.id.Name);
        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyName.class);
                startActivity(intent);
            }
        });

        return view;
    }

}

