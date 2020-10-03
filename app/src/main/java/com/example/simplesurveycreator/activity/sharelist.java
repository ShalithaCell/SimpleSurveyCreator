package com.example.simplesurveycreator.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.simplesurveycreator.R;

public class sharelist extends AppCompatActivity {
    private TextView btn1;
    private ImageView btn2;
    private TextView btn3;
    private ImageView btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharelist);

        btn1= findViewById(R.id.moreooptbtn);
        btn2= findViewById(R.id.moreoptimg);

        btn3= findViewById(R.id.whatsapptextbtn);
        btn4= findViewById(R.id.whatsappimgbtn);


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

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
            }
        });



    }

    public void openActivity1(){
        Intent intent = new Intent(this, Moresharelist.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this, whatsappshare.class);
        startActivity(intent);
    }

}