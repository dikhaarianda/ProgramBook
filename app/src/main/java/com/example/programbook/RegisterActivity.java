package com.example.programbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    userDatabase db;
    EditText name, userName, email, password;
    Button CreateAcc;
    CheckBox Agreement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new userDatabase(this);
        CreateAcc = findViewById(R.id.btn_regist);
        name = findViewById(R.id.txt_name);
        userName = findViewById(R.id.txt_user);
        email = findViewById(R.id.txt_email);
        password = findViewById(R.id.txt_pass2);

        if (Agreement.isChecked()) {
            CreateAcc.setOnClickListener(view -> {
                Intent intentBetul = new Intent(this, LoginActivity.class);
                startActivity(intentBetul);
            });
        }
        else
            CreateAcc.setOnClickListener(view -> {
                Intent intentgagal = new Intent(this, RegisterActivity.class);
                startActivity(intentgagal);
            });
    }
}