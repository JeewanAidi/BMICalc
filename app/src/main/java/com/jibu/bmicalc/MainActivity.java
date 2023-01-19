package com.jibu.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;
        EditText weight , height;
        TextView txt;
        LinearLayout llMain;

        btn = findViewById(R.id.btn);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        txt = findViewById(R.id.txt);
        llMain = findViewById(R.id.llMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               float wt = Float.parseFloat(weight.getText().toString());
               float ht = Float.parseFloat(height.getText().toString());

               double m = ht / 100 ;
               double bmi = wt / (m * m);
               if(bmi>25){
                   txt.setText("You are Overweight!");
                   llMain.setBackgroundColor(getResources().getColor(R.color.colorOw));
               }
               else if (bmi<18){
                   txt.setText("You are Underweight!");
                   llMain.setBackgroundColor(getResources().getColor(R.color.colorUd));
               }
               else{
                   txt.setText("You are Healthy!");
                   llMain.setBackgroundColor(getResources().getColor(R.color.colorH));
               }
            }
        });


    }
}