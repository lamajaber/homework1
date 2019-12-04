package com.example.hwrv;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<Student> studentList = new ArrayList<>();
    Student_adapter student_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.RecyclerView);

        studentList.add(new Student("20151619", "lama jaber", "level 5", "90%"));
        studentList.add(new Student("20161619", "hala jaber", "level 5", "80%"));
        studentList.add(new Student("20171213", "mahmoud jaber", "level 6", "70%"));
        studentList.add(new Student("20183434", "mohaned jaber", "level 3", "70%"));
        studentList.add(new Student("20153293", "ghada jaber", "level 1", "95%"));
        studentList.add(new Student("20153293", "nabil jaber", "level 2", "76%"));
        studentList.add(new Student("20157890", "mohamed jaber", "level 5", "89%"));
        studentList.add(new Student("20157879", "nour jaber", "level 1", "93%"));
        studentList.add(new Student("20156768", "basma jaber", "level 2", "55%"));
        studentList.add(new Student("20154647", "maha jaber", "level 5", "70%"));
        studentList.add(new Student("20152325", "biesan jaber ", "level 1", "90%"));
        studentList.add(new Student("20151617", "rawan jaber", "level 2", "60%"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        student_adapter = new Student_adapter(studentList, this);
        recyclerView.setAdapter(student_adapter);

    }
}
