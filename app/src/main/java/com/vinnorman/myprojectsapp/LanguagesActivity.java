package com.vinnorman.myprojectsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LanguagesActivity extends AppCompatActivity {

    RecyclerView languagesView;
    TextView backTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);

        languagesView = findViewById(R.id.activity_recycler_view);
        backTextView = findViewById(R.id.back_text_view);

        Project[] projects = {
                new Project("HTML & CSS", "Front-End development", R.drawable.html_css),
                new Project("JavaScript", "Front-End development", R.drawable.javascript_logo),
                new Project("React", "Front-End development", R.drawable.react_logo),
                new Project("Python", "Back-End development", R.drawable.python_logo),
                new Project("SQL", "Database", R.drawable.sql_server),
                new Project("SQLite", "Database", R.drawable.sqlite_logo),
                new Project("Kotlin", "Android development", R.drawable.kotlin),
                new Project("Java", "Android development", R.drawable.javalogo)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        languagesView.setAdapter(adapter);

        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(LanguagesActivity.this, MainActivity.class);

                startActivity(mainActivityIntent);
            }
        });

    }
}