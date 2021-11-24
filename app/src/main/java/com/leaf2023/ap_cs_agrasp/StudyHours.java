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

        EditText termField = findViewById(R.id.editTextNumberDecimalNum);
        EditText yearField = findViewById(R.id.editTextNumberDecimalFromBase);
        TextView result = findViewById(R.id.resultBase);

        // Register listener
        findViewById(R.id.buttonSubmitBase).setOnClickListener(view -> {
            try {
                // Parsing
                int term = Integer.parseInt((!termField.getText().toString().equals("") ? termField.getText().toString() : "0"));
                int year = Integer.parseInt((!yearField.getText().toString().equals("") ? yearField.getText().toString() : "0"));

                // Check the term
                if (term > 4 || term < 1) {
                    result.setText("Please state valid term");
                    return;
                }

                // Check the year & final logic
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
            } catch (NumberFormatException x) {
                result.setText("Please fill correct values");
            }
        });
    }
}