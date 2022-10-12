package com.example.rechatv2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ImageView mChatButton;
    private ImageView mFriendsButton;
    private ImageView mDiscoverButton;
    private ImageView mAccountButton;
    private NavController mNavController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChatButton = findViewById(R.id.ChatButton);
        mFriendsButton = findViewById(R.id.FriendsButton);
        mDiscoverButton = findViewById(R.id.DiscoverButton);
        mAccountButton = findViewById(R.id.MyAccountButton);
        mNavController = ((NavHostFragment) Objects.requireNonNull(getSupportFragmentManager().
                            findFragmentById(R.id.fragmentContainer))).getNavController();

        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController.navigate(R.id.chatFragment);
                mChatButton.setBackgroundColor(0xAAAAAA);
                mChatButton.invalidate();
            }
        });

        mFriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController.navigate(R.id.friendsFragment);
                mFriendsButton.setBackgroundColor(0xAAAAAA);
                mFriendsButton.invalidate();
            }
        });

        mDiscoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController.navigate(R.id.discoverFragment);
                mDiscoverButton.setBackgroundColor(0xAAAAAA);
            }
        });

        mAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNavController.navigate(R.id.accountFragment);
                mAccountButton.setBackgroundColor(0xAAAAAA);
            }
        });

    }


}