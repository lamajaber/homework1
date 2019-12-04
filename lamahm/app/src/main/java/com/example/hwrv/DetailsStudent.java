package com.example.hwrv;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsStudent extends AppCompatActivity {


    TextView namee, levell, idd, avgg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_student);

        namee = findViewById(R.id.name);
        levell = findViewById(R.id.level);
        idd = findViewById(R.id.id);
        avgg = findViewById(R.id.avg);

        String name = getIntent().getStringExtra("name");
        String id = getIntent().getStringExtra("id");
        String level = getIntent().getStringExtra("level");
        String avg = getIntent().getStringExtra("avg");


        namee.setText(name);
        idd.setText(id);
        levell.setText(level);
        avgg.setText(avg);


    }
}
