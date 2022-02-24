package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.admin.Adapters.MainAdapter;
import com.example.admin.Adapters.MainAdapter3;
import com.example.admin.Models.MainModel;
import com.example.admin.databinding.ActivityStudentBinding;
import com.example.admin.databinding.ActivityTutorBinding;
import com.google.firebase.ktx.Firebase;

import java.util.ArrayList;

public class TutorActivity extends AppCompatActivity {
    ActivityTutorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTutorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.round_btn, "Tutor Name 1" ));
        list.add(new MainModel(R.drawable.round_btn2, "Tutor Name 2" ));
        list.add(new MainModel(R.drawable.round_btn, "Tutor Name 3" ));
        list.add(new MainModel(R.drawable.round_btn2, "Tutor Name 4" ));
        list.add(new MainModel(R.drawable.round_btn, "Tutor Name 5" ));
        list.add(new MainModel(R.drawable.round_btn2, "Tutor Name 6" ));
        list.add(new MainModel(R.drawable.round_btn, "Tutor Name 7" ));
        list.add(new MainModel(R.drawable.round_btn2, "Tutor Name 8" ));
        list.add(new MainModel(R.drawable.round_btn, "Tutor Name 9" ));

        MainAdapter3 adapter = new MainAdapter3(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}