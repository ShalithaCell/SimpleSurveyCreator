package com.example.simplesurveycreator.recyclerView.adapter.Model;

import android.app.Application;
import android.content.Context;
import android.media.tv.TvView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplesurveycreator.R;
import com.example.simplesurveycreator.model.Questions;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyViewHolder> {

    private List<Questions> questionList;
    private Context context;
    private Application application;

    public QuestionAdapter (List<Questions> _customerList,Context _context) {
        questionList = _customerList;
        context = _context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.question_type_drop_down, parent, false);
        return new QuestionAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Questions customers = questionList.get(position);
        holder.viewTxtQuestion.setText(customers.getQuestionName());
        holder.editTxtQuestion.setText(customers.getQuestionName());

        holder.editTxtQuestion.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener {

        public TextView viewTxtQuestion;
        public EditText editTxtQuestion;
        public ImageButton btnEdit, btnDelete;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            viewTxtQuestion = (TextView) itemView.findViewById(R.id.lblQuestion);
            editTxtQuestion = (EditText) itemView.findViewById(R.id.txtQuestion);

            btnEdit = (ImageButton) itemView.findViewById(R.id.btnEdit);
            btnDelete = (ImageButton) itemView.findViewById(R.id.btnDelete);

            itemView.setOnClickListener(this);
            btnEdit.setOnClickListener(this);
            btnDelete.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId() == btnEdit.getId()){
                viewTxtQuestion.setVisibility(View.INVISIBLE);
                editTxtQuestion.setVisibility(View.VISIBLE);

            }
        }

        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }
}
