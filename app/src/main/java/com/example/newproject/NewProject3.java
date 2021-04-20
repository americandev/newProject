package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewProject3 extends AppCompatActivity implements View.OnClickListener {
    EditText editOne, editTwo;
    Button btnAdd, btnSub, btnMult, btnDiv;
    TextView tvResult;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editOne = findViewById(R.id.etNum1);
        editTwo = findViewById(R.id.etNum2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);

        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if (TextUtils.isEmpty(editOne.getText().toString()) || TextUtils.isEmpty(editTwo.getText().toString())) {
            return;
        }
        num1 = Float.parseFloat(editOne.getText().toString());
        num2 = Float.parseFloat(editOne.getText().toString());
        switch (v.getId()) {
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
        }
        tvResult.setText(num1 + "" + oper + "" + num2 + "=" + result);
    }
}
