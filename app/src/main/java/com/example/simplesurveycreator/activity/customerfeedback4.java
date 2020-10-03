
package com.example.simplesurveycreator.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.simplesurveycreator.R;

public class customerfeedback4 extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerfeedback4);

        btn1 = findViewById(R.id.tem4btn1);

        btn2 = findViewById(R.id.tem4btn2);
        btn3 = findViewById(R.id.tem4btn3);
        btn4 = findViewById(R.id.tem4btn4);

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
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this,customerfeedback3.class);
        startActivity(intent);
    }

    public void openActivity2(){
        Intent intent = new Intent(this,sharelist.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this,sharelist.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this,deletemsg.class);
        startActivity(intent);
    }

}