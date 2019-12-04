package com.example.hwrv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Student_adapter extends RecyclerView.Adapter<StudentVH> {

    List<Student> students;
    Context context;

    public Student_adapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.row_student,parent,false);
        return new StudentVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVH holder, int position) {
holder.setData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}


class StudentVH extends RecyclerView.ViewHolder{

    TextView txt_name,txt_id,txt_level,txt_avg;
    public StudentVH(@NonNull final View itemView) {
        super(itemView);
        txt_avg=itemView.findViewById(R.id.txt_avg);
        txt_name=itemView.findViewById(R.id.txt_name);
        txt_id=itemView.findViewById(R.id.txt_id);
        txt_level=itemView.findViewById(R.id.txt_level);


    }

    public void setData(final Student student) {
        txt_avg.setText(student.getAvg());
        txt_id.setText(student.getId());
        txt_name.setText(student.getName());
        txt_level.setText(student.getLevel());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(itemView.getContext(), DetailsStudent.class);
                intent.putExtra("name",student.getName());
                intent.putExtra("level",student.getLevel());
                intent.putExtra("id",student.getId());
                intent.putExtra("avg",student.getAvg());

                itemView.getContext().startActivity(intent);
            }
        });


    }
}
