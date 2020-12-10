package com.example.andriodfundamentals2020.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.andriodfundamentals2020.R;

public class scrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
    }

    public void test(View view){
        ((TextView)findViewById(R.id.long_text)).setText(R.string.lorem_ipsum_text);
    }
}