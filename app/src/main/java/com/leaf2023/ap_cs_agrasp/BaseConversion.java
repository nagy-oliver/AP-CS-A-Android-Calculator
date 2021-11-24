package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BaseConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_conversion);

        EditText numField = findViewById(R.id.editTextNumberDecimalNum);
        EditText fBaseField = findViewById(R.id.editTextNumberDecimalFromBase);
        EditText tBaseField = findViewById(R.id.editTextNumberDecimalToBase);
        TextView result = findViewById(R.id.resultBase);

        // Register listener
        findViewById(R.id.buttonSubmitBase).setOnClickListener(view -> {
            try {
                  
            } catch (NumberFormatException x) {
                result.setText("Please fill correct values");
            }
        });
    }
}