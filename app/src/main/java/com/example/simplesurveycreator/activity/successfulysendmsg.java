package com.example.simplesurveycreator.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.simplesurveycreator.R;

public class successfulysendmsg extends AppCompatActivity {
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfulysendmsg);

        btn1 = findViewById(R.id.sucbackbtn);
        btn2 = findViewById(R.id.sucexitbtn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


    }

    public void openActivity1(){
        Intent intent = new Intent(this,sharelist.class);
        startActivity(intent);
    }

    public void openActivity2(){
        finish();

    }


}