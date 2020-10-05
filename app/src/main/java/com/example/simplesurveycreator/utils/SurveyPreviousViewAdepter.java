package com.example.simplesurveycreator.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplesurveycreator.R;
import com.example.simplesurveycreator.model.Survey;

import java.util.List;


public class SurveyPreviousViewAdepter extends
        RecyclerView.Adapter<SurveyPreviousViewAdepter.ViewHolder>{

    private List<Survey> surveys;

    public SurveyPreviousViewAdepter(List<Survey> surveys) {
        this.surveys = surveys;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        return null;
        
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView surveyName, lastModifiedDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            surveyName = (TextView) itemView.findViewById(R.id.txtSurveyName);
            lastModifiedDate = (TextView) itemView.findViewById(R.id.txtLastModifiedDate);
        }
    }

}
