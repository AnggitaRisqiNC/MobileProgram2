package com.hello.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hello.R;

public class TabFragment1 extends Fragment {

    private static final String TAG = "TabFragment1";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.activity_tab1, container, false);

        View btnDemon = view.findViewById(R.id.Demon);
        btnDemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyDemon.class);
                startActivity(intent);
            }
        });

        View btnDoona = view.findViewById(R.id.Doona);
        btnDoona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Doona.class);
                startActivity(intent);
            }
        });

        View btnWoo = view.findViewById(R.id.Woo);
        btnWoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AttorneyWoo.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
