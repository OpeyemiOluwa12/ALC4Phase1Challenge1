package com.example.git.alc40phase1challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
    }

    public void viewAbout(View view) {
        Intent intent = new Intent(NavigationActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void viewProfile(View view) {
        Intent intent = new Intent(NavigationActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
