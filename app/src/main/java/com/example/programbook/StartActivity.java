package com.example.programbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);


        // Intent Image Button
        ImageButton logoAPP = findViewById(R.id.LogoButton);
        logoAPP.setOnClickListener(view -> {
            Intent intentLogo = new Intent(this, LoginActivity.class);

            startActivity(intentLogo);
        });
    }
}