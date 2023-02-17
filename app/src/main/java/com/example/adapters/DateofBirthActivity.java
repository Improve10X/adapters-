package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DateofBirthActivity extends AppCompatActivity {
    String[] date = {"select","01","02","03","04","05","06","07","08","09","10"};
    String[] month = {"select","01","02","03","04","05","06","07","08","09","10"};
    String[] year = {"select","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
    ArrayAdapter dateAdapter;
    ArrayAdapter monthAdapter;
    ArrayAdapter yearAdapter;
    Spinner dateSp;
    Spinner monthSp;
    Spinner yearSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dateof_birth);
        inItViews();
        setUpAdapter();
        connentAdapter();
    }

    private void connentAdapter() {
        dateSp.setAdapter(dateAdapter);
        monthSp.setAdapter(monthAdapter);
        yearSp.setAdapter(yearAdapter);
    }

    private void setUpAdapter() {
        dateAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,date);
        monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,month);
        yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,year);
    }

    private void inItViews() {
        dateSp = findViewById(R.id.date_sp);
        monthSp = findViewById(R.id.month_sp);
        yearSp = findViewById(R.id.year_sp);
    }
}