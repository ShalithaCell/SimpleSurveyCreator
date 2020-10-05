package com.example.simplesurveycreator.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.simplesurveycreator.R;

public class MainActivity2 extends AppCompatActivity {
    private TextView btn1;
    private ConstraintLayout btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn1= findViewById(R.id.sampleteplistbtn2);
        btn2= findViewById(R.id.f1btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this, Populertemlist.class);
        startActivity(intent);
    }

}