package com.example.simplesurveycreator.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesurveycreator.R;

public class requestnewchart2 extends Fragment {



    public requestnewchart2() {
        // Required empty public constructor
    }


    public static requestnewchart2 newInstance(String param1, String param2) {
        requestnewchart2 fragment = new requestnewchart2();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_requestnewchart2, container, false);
    }
}