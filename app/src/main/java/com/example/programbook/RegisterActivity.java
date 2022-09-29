package com.example.programbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    userDatabase db;
    EditText name, userName, email, password;
    Button login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new userDatabase(this);
        login2 = findViewById(R.id.btn_login2);
        name = findViewById(R.id.txt_name);
        userName = findViewById(R.id.txt_user);
        email = findViewById(R.id.txt_email);
        password = findViewById(R.id.txt_pass2);

        login2.setOnClickListener(view -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }
}