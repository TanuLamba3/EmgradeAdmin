package com.example.admin.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.admin.MainActivity;
import com.example.admin.Models.MainModel;
import com.example.admin.R;
import com.example.admin.TutSubjectActivity;

import java.util.ArrayList;

public class MainAdapter3 extends RecyclerView.Adapter<MainAdapter3.viewholder>{

    ArrayList<MainModel> list;
    Context context;

    public MainAdapter3(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_row, parent , false);
        return new MainAdapter3.viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final MainModel model = list.get(position);
        holder.image.setImageResource(model.getImage());
        holder.student.setText(model.getStudent());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TutSubjectActivity.class);
                intent.putExtra("Subject ", model.getStudent());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView student;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageF);
            student = itemView.findViewById(R.id.Titletxt);
        }
    }
}
