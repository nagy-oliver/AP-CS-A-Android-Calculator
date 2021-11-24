package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.lang.Math;
import android.widget.EditText;
import android.widget.TextView;

public class RNG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rng);

        EditText fromField = findViewById(R.id.editTextNumber);
        EditText toField = findViewById(R.id.editTextNumber2);
        TextView result = findViewById(R.id.resultNum);

        findViewById(R.id.buttonGenerate).setOnClickListener(view -> {
            int from = Integer.parseInt((!fromField.getText().toString().equals("") ? fromField.getText().toString() : "0"));
            int to = Integer.parseInt((!toField.getText().toString().equals("") ? toField.getText().toString() : "0"));
            result.setText(""+(int)(Math.random()*(to-from+1)+from));
        });
    }
}