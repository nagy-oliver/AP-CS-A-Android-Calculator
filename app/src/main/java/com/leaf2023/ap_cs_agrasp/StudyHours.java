package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class StudyHours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_hours);

        EditText termField = findViewById(R.id.editTextNumberDecimalTerm);
        EditText yearField = findViewById(R.id.editTextNumberDecimalYear);
        TextView result = findViewById(R.id.resultStudy);

        findViewById(R.id.buttonSubmitStudy).setOnClickListener(view -> {
            int term = Integer.parseInt(termField.getText().toString());
            int year = Integer.parseInt(yearField.getText().toString());
            switch (year) {
                case 1: case 2:
                    result.setText("Yes!");
                    break;
                case 3:
                    result.setText(term == 1 ? "Yes!" : "No!");
                    break;
                case 4:
                    result.setText("No!");
                    break;
                default:
                    result.setText("Please state valid year");
            }
        });
    }
}