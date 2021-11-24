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

        //saving .xml elements as variables
        EditText weightField = findViewById(R.id.editTextNumberDecimalNum);
        RadioButton male = findViewById(R.id.radioButton);
        RadioButton female = findViewById(R.id.radioButton2);
        TextView result = findViewById(R.id.textView3);

        //sets male true by default
        male.setChecked(true);

        //what happens after clicking Calculate button
        findViewById(R.id.buttonGetCalories).setOnClickListener(view -> {
            boolean gender = !male.isChecked() && female.isChecked(); //finding the gender selected
            int weight = Integer.parseInt((!weightField.getText().toString().equals("") ? weightField.getText().toString() : "0"));

            //calculates the BMR calories based on a set formula
            result.setText(""+(int)(gender?0.9:1.0) * weight * 24+" Calories/day");
        });

    }
}