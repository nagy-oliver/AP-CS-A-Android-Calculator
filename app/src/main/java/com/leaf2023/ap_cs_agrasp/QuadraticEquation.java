package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class QuadraticEquation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_equation);

        EditText atext = findViewById(R.id.editTextNumberDecimal);
        EditText btext = findViewById(R.id.editTextNumberDecimal2);
        EditText ctext = findViewById(R.id.editTextNumberDecimal3);
        TextView result = findViewById(R.id.resultQuadra);

        class RootsIrrationalException extends Exception {
            public RootsIrrationalException(String errorMessage) {
                super(errorMessage);
            }
        }

        findViewById(R.id.buttonSubmitQuadra).setOnClickListener(view -> {
            try {
                double a = Double.parseDouble((!atext.getText().toString().equals("") ? atext.getText().toString() : "0"));
                double b = Double.parseDouble((!btext.getText().toString().equals("") ? btext.getText().toString() : "0"));
                double c = Double.parseDouble((!ctext.getText().toString().equals("") ? ctext.getText().toString() : "0"));

                double disc = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
                double positive = (-b + disc) / (2 * a);
                double negative = (-b - disc) / (2 * a);
                if (Double.isNaN(positive) && Double.isNaN(negative)) throw new RootsIrrationalException("Both roots are imaginary");
                result.setText(String.format("x = { %f , %f }", positive, negative));
            } catch (NumberFormatException x) {
                result.setText("Please fill correct values");
            } catch (RootsIrrationalException x) {
                result.setText(x.getMessage());
            }
        });
    }
}