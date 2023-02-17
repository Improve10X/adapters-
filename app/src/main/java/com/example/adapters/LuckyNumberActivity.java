package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LuckyNumberActivity extends AppCompatActivity {
    String[] numbers = {"select","1","2","3","4","5","6","7","8","9","10"};
    Spinner numbersSp;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        intiviews();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
    numbersSp.setAdapter(adapter);
    }
    private void setupAdapter() {
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,numbers);
    }
    private void intiviews() {
        numbersSp = findViewById(R.id.numbers_sp);
    }
}