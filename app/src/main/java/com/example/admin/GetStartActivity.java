package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetStartActivity extends AppCompatActivity {
    Button btn_start;
    TextView loginTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);
        btn_start = findViewById(R.id.btn_start);
        loginTxt = findViewById(R.id.loginTxt);

        getSupportActionBar().hide();
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(GetStartActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        loginTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(GetStartActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}