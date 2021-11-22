package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.security.KeyPair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<Integer, Intent> options = Collections.unmodifiableMap(new HashMap<Integer, Intent>() {{
            put(R.id.button, new Intent(getBaseContext(), MainActivity.class));
        }});

        for (HashMap.Entry<Integer, Intent> a: options.entrySet()) {
            findViewById(a.getKey()).setOnClickListener(view -> { startActivity(a.getValue()); });
        }
    }
}