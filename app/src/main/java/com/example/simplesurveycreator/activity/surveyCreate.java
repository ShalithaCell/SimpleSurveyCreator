package com.example.simplesurveycreator.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesurveycreator.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link surveyCreate#newInstance} factory method to
 * create an instance of this fragment.
 */
public class surveyCreate extends Fragment {


    public surveyCreate() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static surveyCreate newInstance() {
        surveyCreate fragment = new surveyCreate();
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
        View rootView = inflater.inflate(R.layout.fragment_survey_create, container, false);

        return rootView;
    }
}