package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.Adapters.MainAdapter;
import com.example.admin.Models.MainModel;
import com.example.admin.databinding.ActivityStudentBinding;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    ActivityStudentBinding binding;
//    ImageView stud_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        stud_img = findViewById(R.id.stud_img);
        getSupportActionBar().hide();

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.round_btn, "Student Name 1" ));
        list.add(new MainModel(R.drawable.round_btn2, "Student Name 2" ));
        list.add(new MainModel(R.drawable.round_btn, "Student Name 3" ));
        list.add(new MainModel(R.drawable.round_btn2, "Student Name 4" ));
        list.add(new MainModel(R.drawable.round_btn, "Student Name 5" ));
        list.add(new MainModel(R.drawable.round_btn2, "Student Name 6" ));
        list.add(new MainModel(R.drawable.round_btn, "Student Name 7" ));
        list.add(new MainModel(R.drawable.round_btn2, "Student Name 8" ));
        list.add(new MainModel(R.drawable.round_btn, "Student Name 9" ));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
//        stud_img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(StudentActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}