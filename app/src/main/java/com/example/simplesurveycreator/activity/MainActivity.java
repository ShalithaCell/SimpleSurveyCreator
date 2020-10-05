package com.example.simplesurveycreator.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.simplesurveycreator.R;

public class MainActivity extends AppCompatActivity {
    private Button btndula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndula = findViewById(R.id.selecttepmainbtn);
        btndula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this,customerfeedbacktemplete.class);
        startActivity(intent);
    }


}