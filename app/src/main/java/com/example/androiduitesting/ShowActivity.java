package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "com.example.androiduitesting.EXTRA_CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra(EXTRA_CITY_NAME);
        if (cityName == null) {
            cityName = "";
        }
        cityNameText.setText(cityName);

        backButton.setOnClickListener(v -> finish());
    }
}