package com.vinnorman.myprojectsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AndroidProjectsActivity extends AppCompatActivity {

    RecyclerView projectsView;

    TextView backTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_projects);

        projectsView = findViewById(R.id.projects_recycler_view);
        backTextView = findViewById(R.id.back_text_view);

        Project[] projects = {
                new Project("Feeder", "App for music feedback built with Kotlin.", R.drawable.kotlin),
                new Project("Calculator", "Calculator app built with Kotlin.", R.drawable.kotlin),
                new Project("TicTacToe", "TicTacToe game built with Kotlin.", R.drawable.kotlin),
                new Project("NBA Top 10 App ", "Mobile App made with java about basketball players.", R.drawable.javalogo),
                new Project("Inches Converter App ", "Converting inches into meters using Java.", R.drawable.javalogo),
                new Project("PortfoliDroid", "Android portfolio application using Java.", R.drawable.javalogo)
        };

        ProjectsAdapter projectsAdapter = new ProjectsAdapter(projects);

        projectsView.setAdapter(projectsAdapter);

        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(AndroidProjectsActivity.this, MainActivity.class);

                startActivity(mainActivityIntent);
            }
        });

    }
}