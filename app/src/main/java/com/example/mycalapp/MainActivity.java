package com.example.mycalapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText e1, e2;
    Button b1, b2, b3, b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.tvResult);
        e1 = (EditText) findViewById(R.id.etNum1);
        e2 = (EditText) findViewById(R.id.etNum2);
        b1 = (Button) findViewById(R.id.btnAdd);
        b2 = (Button) findViewById(R.id.btnSub);
        b3 = (Button) findViewById(R.id.btnMult);
        b4 = (Button) findViewById(R.id.btnDiv);

        try {
            b1.setOnClickListener(this);
            b2.setOnClickListener(this);
            b3.setOnClickListener(this);
            b4.setOnClickListener(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAdd) {
            String v1 = e1.getText().toString();
            String v2 = e2.getText().toString();
            if (v1.isEmpty() && v2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Shit!! Dude enter something", Toast.LENGTH_LONG).show();
            } else {
                double var1 = Double.valueOf(v1);
                double var2 = Double.valueOf(v2);
                double result = var1 + var2;
                t1.setText("Your Addition result will be :" + result);
               // Toast.makeText(getApplicationContext(), "add" + result, Toast.LENGTH_LONG).show();
            }
        } else if (v.getId() == R.id.btnSub) {
            String v1 = e1.getText().toString();
            String v2 = e2.getText().toString();
            if (v1.isEmpty() && v2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Shit!! Dude enter something", Toast.LENGTH_LONG).show();
            } else {
                double var1 = Double.valueOf(v1);
                double var2 = Double.valueOf(v2);
                double result = var1 - var2;
                t1.setText("Your Subtraction result will be :" + result);
                //Toast.makeText(getApplicationContext(), "add" + result, Toast.LENGTH_LONG).show();
            }
        }else if (v.getId() == R.id.btnMult) {
            String v1 = e1.getText().toString();
            String v2 = e2.getText().toString();
            if (v1.isEmpty() && v2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Shit!! Dude enter something", Toast.LENGTH_LONG).show();
            } else {
                double var1 = Double.valueOf(v1);
                double var2 = Double.valueOf(v2);
                double result = var1 * var2;
                t1.setText("Your Multiplication result will be :" + result);
                //Toast.makeText(getApplicationContext(), "add" + result, Toast.LENGTH_LONG).show();
            }
        }else if (v.getId() == R.id.btnDiv) {
            String v1 = e1.getText().toString();
            String v2 = e2.getText().toString();
            if (v1.isEmpty() && v2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Shit!! Dude enter something", Toast.LENGTH_LONG).show();
            } else {
                double var1 = Double.valueOf(v1);
                double var2 = Double.valueOf(v2);
                double result = var1 / var2;
                t1.setText("Your Division result will be :" + result);
                //Toast.makeText(getApplicationContext(), "add" + result, Toast.LENGTH_LONG).show();
            }
        }
    }
}
