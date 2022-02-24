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
import com.example.admin.Models.DataModel;
import com.example.admin.Models.MainModel;
import com.example.admin.R;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.viewholder>{

    ArrayList<DataModel> list;
    Context context;

    public DataAdapter(ArrayList<DataModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.data_of_student, parent , false);
        return new DataAdapter.viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final DataModel model = list.get(position);
        getItemViewType(model.getView1());
        holder.classNum.setText(model.getClassNum());
        holder.dayNum.setText(model.getDayNum());
        holder.timeNum.setText(model.getTimeNum());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context, MainActivity.class);
//                intent.putExtra("Subject ", model.getStudent());
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        View View1;
        TextView classNum, dayNum, timeNum;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            View1 = itemView.findViewById(R.id.view);
            classNum = itemView.findViewById(R.id.classesNum);
            dayNum = itemView.findViewById(R.id.dayNum);
            timeNum = itemView.findViewById(R.id.timeNum);
        }
    }
}
