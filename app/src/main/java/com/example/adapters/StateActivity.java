package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class StateActivity extends AppCompatActivity {
    public  String [] states = {"states","arunachalan pradesh","assam","bihar","Chennai"};
    Spinner statesSp;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        handleInitViews();
        setupAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        statesSp.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,states);
    }

    private void handleInitViews() {
        statesSp = findViewById(R.id.states_sp);
    }
}