package com.example.programbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"test",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"joo",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"Data ini cuman test",Toast.LENGTH_LONG).show();
    }
}