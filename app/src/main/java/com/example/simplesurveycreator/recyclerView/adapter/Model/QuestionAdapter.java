package com.example.simplesurveycreator.recyclerView.adapter.Model;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.media.tv.TvView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplesurveycreator.R;
import com.example.simplesurveycreator.model.Options;
import com.example.simplesurveycreator.model.Questions;
import com.example.simplesurveycreator.utils.QuestionTypes;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.List;

import fr.ganfra.materialspinner.MaterialSpinner;
import io.apptik.widget.multiselectspinner.MultiSelectSpinner;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyViewHolder> {

    private List<Questions> questionList;
    private Context context;
    private Application application;

    private RecyclerView recyclerView;
    private OptionAdaptor mAdapter;

    private List<Options> options = new ArrayList<Options>();
    String[] ITEMS = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "Option 6"};
    ArrayAdapter<String> adapterDDL;

    public QuestionAdapter (List<Questions> _customerList,Context _context) {
        questionList = _customerList;
        context = _context;

        options.add(new Options("Option 1"));
        options.add(new Options("Option 2"));
        options.add(new Options("Option 3"));
        options.add(new Options("Option 4"));
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if(viewType == QuestionTypes.MULTI_CHOICE.ordinal()){
            View v1 = inflater.inflate(R.layout.question_type_drop_down, parent, false);
            viewHolder = new QuestionAdapter.MyViewHolder(v1);
        }else if(viewType == QuestionTypes.DROPDOWN.ordinal()){
            View v1 = inflater.inflate(R.layout.question_type_spinner, parent, false);
            viewHolder = new QuestionAdapter.MyViewHolder(v1);
        }else {
            View v1 = inflater.inflate(R.layout.question_type_drop_down, parent, false);
            viewHolder = new QuestionAdapter.MyViewHolder(v1);
        }

        return (MyViewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Questions customers = questionList.get(position);
        holder.viewTxtQuestion.setText(customers.getQuestionName());
        holder.editTxtQuestion.setText(customers.getQuestionName());

        holder.editTxtQuestion.setVisibility(View.INVISIBLE);
        holder.layoutOptions.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(questionList.get(position).getType() == QuestionTypes.MULTI_CHOICE){
            return QuestionTypes.MULTI_CHOICE.ordinal();
        }else if(questionList.get(position).getType() == QuestionTypes.DROPDOWN){
            return QuestionTypes.DROPDOWN.ordinal();
        }
        return -1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener {

        public TextView viewTxtQuestion;
        public EditText editTxtQuestion;
        public ImageButton btnEdit, btnDelete;
        public ConstraintLayout layoutOptionsView;
        public LinearLayout layoutOptions;
        public MaterialSpinner spinner;

        MultiSelectSpinner multiSelectSpinner;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            viewTxtQuestion = (TextView) itemView.findViewById(R.id.lblQuestion);
            editTxtQuestion = (EditText) itemView.findViewById(R.id.txtQuestion);

            btnEdit = (ImageButton) itemView.findViewById(R.id.btnEdit);
            btnDelete = (ImageButton) itemView.findViewById(R.id.btnDelete);

            layoutOptions = (LinearLayout) itemView.findViewById(R.id.layoutOptions);
            layoutOptionsView = (ConstraintLayout) itemView.findViewById(R.id.layoutOptionsView);

            recyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_options);

            mAdapter = new OptionAdaptor(options, context.getApplicationContext());
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context.getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.addItemDecoration(new DividerItemDecoration(context.getApplicationContext(), LinearLayoutManager.VERTICAL));
            recyclerView.setAdapter(mAdapter);

//            adapterDDL = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, ITEMS);
//            adapterDDL.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            spinner = (MaterialSpinner) itemView.findViewById(R.id.spinner);
//            spinner.setAdapter(adapterDDL);

            itemView.setOnClickListener(this);
            btnEdit.setOnClickListener(this);
            btnDelete.setOnClickListener(this);
        }



        @Override
        public void onClick(View view) {
            if (view.getId() == btnEdit.getId()){

                if(viewTxtQuestion.getVisibility() == View.VISIBLE){
                    viewTxtQuestion.setVisibility(View.INVISIBLE);
                    editTxtQuestion.setVisibility(View.VISIBLE);
                    layoutOptions.setVisibility(View.VISIBLE);
                    layoutOptionsView.setVisibility(View.INVISIBLE);
                    btnEdit.setColorFilter(ContextCompat.getColor(context, R.color.colorPrimaryConsultant), android.graphics.PorterDuff.Mode.SRC_IN);
                    return;
                }

                viewTxtQuestion.setVisibility(View.VISIBLE);
                editTxtQuestion.setVisibility(View.INVISIBLE);
                layoutOptions.setVisibility(View.GONE);
                layoutOptionsView.setVisibility(View.VISIBLE);
                btnEdit.setColorFilter(ContextCompat.getColor(context, R.color.efab_disabled_text), android.graphics.PorterDuff.Mode.SRC_IN);

            }else if(view.getId() == btnDelete.getId()){
                new MaterialAlertDialogBuilder(context, R.style.MyThemeOverlay_MaterialComponents_MaterialAlertDialog)
                        .setTitle("Confirm to delete")
                        .setMessage("Are your sure want delete "+viewTxtQuestion.getText() + " ?")

                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                int idx = 0;

                                while (idx < questionList.size())
                                {
                                    if(questionList.get(idx).getQuestionName() == viewTxtQuestion.getText())
                                    {
                                        // Remove item
                                        questionList.remove(idx);
                                    }
                                    else
                                    {
                                        ++idx;
                                    }
                                }
                                notifyDataSetChanged();
                            }
                        })
                        .show();
            }
        }

        @Override
        public boolean onLongClick(View view) {
            return false;
        }
    }
}
