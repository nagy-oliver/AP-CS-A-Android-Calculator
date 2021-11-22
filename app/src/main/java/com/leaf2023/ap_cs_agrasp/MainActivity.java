package com.leaf2023.ap_cs_agrasp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create map that holds info about all calculator destinations -> where to navigate
        Map<Integer, Intent> options = Collections.unmodifiableMap(new HashMap<Integer, Intent>() {{
            put(R.id.button, new Intent(getBaseContext(), QuadraticEquation.class));
            put(R.id.button2, new Intent(getBaseContext(), Nutrition.class));
            put(R.id.button3, new Intent(getBaseContext(), StudyHours.class));
            put(R.id.button4, new Intent(getBaseContext(), BaseConversion.class));
            put(R.id.button5, new Intent(getBaseContext(), RNG.class));
        }});

        // Attach layout change to listener
        for (HashMap.Entry<Integer, Intent> a: options.entrySet()) {
            findViewById(a.getKey()).setOnClickListener(view -> { startActivity(a.getValue()); });
        }
    }
}