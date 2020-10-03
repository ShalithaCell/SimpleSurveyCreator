package com.example.simplesurveycreator.activity;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplesurveycreator.R;

import java.util.ArrayList;

public class Populertemlist extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_populertemlist);
        Log.d(TAG, "onCreate: started");
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: started");
        mImageUrls.add("https://www.omniconvert.com/wp-content/uploads/2019/10/new-hero-ab-testing-copy-med.png");
        mNames.add("Customer Feedback");
        mImageUrls.add("https://img.favpng.com/15/19/11/questionnaire-checklist-survey-methodology-png-favpng-80VDM76Z8eENDjLFDBUMX6cEa.jpg");
        mNames.add("Product Survey");
        mImageUrls.add("https://img2.pngio.com/survey-png-5-png-image-survey-png-379_379.png");
        mNames.add("Employee Feedback");
        mImageUrls.add("https://www.clipartkey.com/mpngs/m/158-1580691_feedback-survey-icon-png.png");
        mNames.add("Vaction Travel Template");
        mImageUrls.add("https://www.freeiconspng.com/uploads/survey-icon-12.png");
        mNames.add("Learning Support Template");
        mImageUrls.add("https://www.clipartmax.com/png/middle/421-4213973_analysis-clipart-problem-identification-png-free-survey-icon.png");
        mNames.add("Volunteer Feedback");
        mImageUrls.add("https://s7641.pcdn.co/wp-content/uploads/2020/09/Create-a-Survey.jpg");
        mNames.add("Social Media");
        mImageUrls.add("https://www.questionpro.com/blog/wp-content/uploads/2019/02/Web-Survey.jpg");
        mNames.add("Course evaluation Template");
        mImageUrls.add("https://www.clipartkey.com/mpngs/m/158-1580691_feedback-survey-icon-png.png");
        mNames.add("Happiness Survey");
        mImageUrls.add("https://img.icons8.com/bubbles/2x/survey.png");
        mNames.add("Hobbies");
        mImageUrls.add("https://p.kindpng.com/picc/s/179-1799387_survey-icon-png-circle-png-download-survey-png.png");
        mNames.add("Quarantine Questions");
        mImageUrls.add("https://image.flaticon.com/icons/png/512/1169/1169549.png");
        mNames.add("Remote Work Related Poll");
        mImageUrls.add("https://w7.pngwing.com/pngs/995/238/png-transparent-the-checklist-manifesto-application-form.png");
        mNames.add("Mobile Apps Survey");
        mImageUrls.add("https://w7.pngwing.com/pngs/641/283/png-transparent-computer-icons-web-browser-form-world-wide-web-blue-text-rectangle.png");
        mNames.add("Air Pollution");
        mImageUrls.add("https://img.icons8.com/bubbles/2x/form.png");
        mNames.add("Online Classes Survey");
        mImageUrls.add("https://cdn1.vectorstock.com/i/1000x1000/24/40/modern-flat-icon-with-set-of-folders-documents-vector-8222440.jpg");
        mNames.add("Hotel Guest Feedback");
        initRecyclerView();
    }
    private  void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: started");

        RecyclerView recyclerView = findViewById(R.id.recycler_view2);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames,mImageUrls,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
