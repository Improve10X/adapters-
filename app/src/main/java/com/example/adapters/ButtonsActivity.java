package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsActivity extends AppCompatActivity {
    Button luckyNumberBtn;
    Button loactionBtn;
    Button dateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        inItViews();
        handleLuckyNumberBtn();
        handleLoactionBtn();
        handleDateBtn();
    }

    private void handleDateBtn() {
        dateBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,DateofBirthActivity.class);
            startActivity(intent);
        });
    }

    private void handleLoactionBtn() {
        loactionBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,StateActivity.class);
            startActivity(intent);
        });
    }

    private void handleLuckyNumberBtn() {
        luckyNumberBtn.setOnClickListener(v ->{
            Intent intent = new Intent(this,LuckyNumberActivity.class);
            startActivity(intent);
        } );
    }

    private void inItViews() {
        luckyNumberBtn = findViewById(R.id.luckynumber_btn);
        loactionBtn = findViewById(R.id.loaction_btn);
        dateBtn = findViewById(R.id.date_btn);
    }
}