package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.admin.Adapters.MainAdapter;
import com.example.admin.Adapters.MainAdapter2;
import com.example.admin.Models.MainModel;
import com.example.admin.databinding.ActivityStudentBinding;
import com.example.admin.databinding.ActivitySubjectBinding;

import java.util.ArrayList;

public class SubjectActivity extends AppCompatActivity {

    ActivitySubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.round_btn, "Subject 1" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject 2" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject 3" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject 4" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject 5" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject 6" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject 7" ));
        list.add(new MainModel(R.drawable.round_btn2, "Subject 8" ));
        list.add(new MainModel(R.drawable.round_btn, "Subject 9" ));

        MainAdapter2 adapter = new MainAdapter2(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
}