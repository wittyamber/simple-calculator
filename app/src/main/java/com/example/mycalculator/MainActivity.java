package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View view){
        EditText number_1 = (EditText) findViewById(R.id.number_1);
        EditText number_2 = (EditText) findViewById(R.id.number_2);
        EditText res = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number_1.getText().toString());
        int n2 = Integer.parseInt(number_2.getText().toString());
        int result = n1+n2;

        res.setText("Total Value " + result);
    }

    public void Subtract(View view){
        EditText number_1 = (EditText) findViewById(R.id.number_1);
        EditText number_2 = (EditText) findViewById(R.id.number_2);
        EditText res = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number_1.getText().toString());
        int n2 = Integer.parseInt(number_2.getText().toString());
        int result = n1-n2;

        res.setText("Total Value " + result);
    }

    public void multiply(View view){
        EditText number_1 = (EditText) findViewById(R.id.number_1);
        EditText number_2 = (EditText) findViewById(R.id.number_2);
        EditText res = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number_1.getText().toString());
        int n2 = Integer.parseInt(number_2.getText().toString());
        int result = n1*n2;

        res.setText("Total Value " + result);
    }

    public void Divide(View view){
        EditText number_1 = (EditText) findViewById(R.id.number_1);
        EditText number_2 = (EditText) findViewById(R.id.number_2);
        EditText res = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number_1.getText().toString());
        int n2 = Integer.parseInt(number_2.getText().toString());
        int result = n1/n2;

        res.setText("Total Value " + result);
    }
}