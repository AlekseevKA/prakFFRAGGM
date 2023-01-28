package com.example.smartwatch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.smartwatch.databinding.ActivityLightBinding;

public class LightActivity extends Activity {

    private ActivityLightBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLightBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}