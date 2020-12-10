package com.example.andriodfundamentals2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

import static com.example.andriodfundamentals2020.R.*;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main3);


        TextInputLayout emailImputLayout = findViewById(id.til_email);

        findViewById(id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailImputLayout.setError("test");
            }
        });
    }

}