package com.example.rechatv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Calendar;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        intent.putExtra("Info", "现在我在写实验，我的老师是肖蓉。"+"现在时间是： "+ Calendar.getInstance().getTime());
        setResult(1024, intent);
        finish();
    }
}