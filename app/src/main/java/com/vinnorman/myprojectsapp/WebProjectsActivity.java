package com.vinnorman.myprojectsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WebProjectsActivity extends AppCompatActivity {

    RecyclerView webProjectsView;
    TextView backTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_projects);

        webProjectsView = findViewById(R.id.web_projects_recycler_view);
        backTextView = findViewById(R.id.back_text_view);

        Project[] webProjects = {
                new Project("MovieAPI", "Working with HTML&CSS and API of movies with JS.", R.drawable.html_css_js),
                new Project("NBA Stats App", "A fully responsive website built with React about NBA players.", R.drawable.react_logo),
                new Project("Fusely", "Fully responsive Landing page built with HTML&CSS.", R.drawable.html_css),
                new Project("Product Preview Card Component", "Task from Frontend Mentor using HTML & CSS.", R.drawable.html_css),
                new Project("Tidder", "Me and my partner built this project, I worked on a front-end side.", R.drawable.html_css),
                new Project("Ship Battle", "This is a fun game made by me about ships with python OOP.", R.drawable.python_logo),
                new Project("Pokemon API", "I used pokeAPI for the information about pokemons and" +
                        " their abilities, created a table in python and saved data there. ", R.drawable.python_logo)
        };

        ProjectsAdapter webProjectsAdapter = new ProjectsAdapter(webProjects);

        webProjectsView.setAdapter(webProjectsAdapter);

        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(WebProjectsActivity.this, MainActivity.class);

                startActivity(mainActivityIntent);
            }
        });

    }
}