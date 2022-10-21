package com.example.rechatv2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemAcitivity extends AppCompatActivity {
    private Button mInfoButton;
    private TextView mInfoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        mInfoButton = findViewById(R.id.infoButton);
        mInfoView = findViewById(R.id.infoView);

        mInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemAcitivity.this, ResultActivity.class);
                test.launch(intent);
            }
        });
    }
    public ActivityResultLauncher test;
    {
        test = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {

                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if(result.getResultCode() == 1024){
                            Log.d("xr", "onActivityResultLauncher...");
                            mInfoView.setText(result.getData().getStringExtra("Info"));
                        }
                    }
                });
    }
}