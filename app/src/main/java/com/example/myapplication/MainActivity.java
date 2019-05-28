package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPlus, btnMinus;
    TextView txtNum, txtResult;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = 0;

        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnMinus=(Button)findViewById(R.id.btnMinus);

        txtNum = (TextView)findViewById(R.id.txtNum);
        txtResult = (TextView)findViewById(R.id.txtNum);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                String strNum = Integer.toString(num);
                txtNum.setText(strNum);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num--;
                String strNum = Integer.toString(num);
                txtNum.setText(strNum);
            }
        });
        String strReuslt = Integer.toString(num*3);
        txtResult.setText(strReuslt);
    }
}
