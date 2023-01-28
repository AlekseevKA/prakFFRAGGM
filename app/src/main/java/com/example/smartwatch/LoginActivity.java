package com.example.smartwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smartwatch.databinding.ActivityLoginBinding;

public class LoginActivity extends Activity {

    private TextView mTextView;
    private ActivityLoginBinding binding;
    Button EnterBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        EnterBtn = findViewById(R.id.EnterBtn);
        EnterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));

            }
        });
    }
}