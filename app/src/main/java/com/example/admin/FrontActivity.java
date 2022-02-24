package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.databinding.ActivityFrontBinding;

public class FrontActivity extends AppCompatActivity {

    ActivityFrontBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFrontBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.stuimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FrontActivity.this,StudentActivity.class);
                startActivity(intent);
            }
        });
        binding.tutimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FrontActivity.this,TutorActivity.class);
                startActivity(intent);
            }
        });
        binding.stutxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FrontActivity.this,StudentActivity.class);
                startActivity(intent);
            }
        });
        binding.tuttxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FrontActivity.this,TutorActivity.class);
                startActivity(intent);
            }
        });

    }
}