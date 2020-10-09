package com.example.simplesurveycreator.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesurveycreator.R;
import com.example.simplesurveycreator.model.Options;
import com.example.simplesurveycreator.model.Questions;
import com.example.simplesurveycreator.recyclerView.adapter.Model.CallBackListener;
import com.example.simplesurveycreator.recyclerView.adapter.Model.QuestionAdapter;
import com.example.simplesurveycreator.utils.QuestionTypes;
import com.nambimobile.widgets.efab.FabOption;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link surveyCreate#newInstance} factory method to
 * create an instance of this fragment.
 */
public class surveyCreate extends Fragment implements CallBackListener {

    public List<Questions> questionList = new ArrayList<>();
    private RecyclerView recyclerView;
    private QuestionAdapter mAdapter;

    private FabOption btnMultipleChoice, btnDropDown;

    private List<Options> options = new ArrayList<Options>();

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

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_inventory);
        btnMultipleChoice = rootView.findViewById(R.id.btnMultipleChoice);
        btnDropDown = rootView.findViewById(R.id.btnDropDown);

        options.add(new Options("Option 1"));
        options.add(new Options("Option 2"));
        options.add(new Options("Option 3"));
        options.add(new Options("Option 4"));

        mAdapter = new QuestionAdapter(questionList, getContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        LoadCustomerList("Question name", QuestionTypes.MULTI_CHOICE);

        btnMultipleChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadCustomerList("Question name", QuestionTypes.MULTI_CHOICE);
            }
        });

        btnDropDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoadCustomerList("Question name", QuestionTypes.DROPDOWN);
            }
        });

        return rootView;
    }

    @Override
    public void onDismiss() {

    }

    public void LoadCustomerList(String questionName, QuestionTypes type){
        // questionList.clear();
        questionList.add(new Questions(questionName, options, type));
        mAdapter.notifyDataSetChanged();
    }
}