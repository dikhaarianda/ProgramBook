package com.example.programbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.txt_login);
        login = findViewById(R.id.btn_login);
        login.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            String users = username.getText().toString();
            intent.putExtra("Username", users);
            startActivity(intent);
        });
    }
}