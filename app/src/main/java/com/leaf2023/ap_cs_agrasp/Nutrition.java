package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Nutrition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        EditText weight = findViewById(R.id.editTextNumberDecimalTerm);
        RadioButton male = findViewById(R.id.radioButton);
        RadioButton female = findViewById(R.id.radioButton2);
        TextView result = findViewById(R.id.textView3);

        findViewById(R.id.buttonSubmitStudy).setOnClickListener(view -> {

        });

    }
}