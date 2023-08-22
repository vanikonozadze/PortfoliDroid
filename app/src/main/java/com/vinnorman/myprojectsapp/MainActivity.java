package com.vinnorman.myprojectsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView codingCardView;
    CardView mobileCardView;
    CardView webCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codingCardView = findViewById(R.id.coding_card_view);
        mobileCardView = findViewById(R.id.mobile_card_view);
        webCardView = findViewById(R.id.web_card_view);


        codingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent languagesActivityIntent = new Intent(MainActivity.this, LanguagesActivity.class);

                startActivity(languagesActivityIntent);
            }
        });

        mobileCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent projectsActivityIntent = new Intent(MainActivity.this, AndroidProjectsActivity.class);

                startActivity(projectsActivityIntent);
            }
        });

        webCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webProjectsActivityIntent = new Intent(MainActivity.this, WebProjectsActivity.class);

                startActivity(webProjectsActivityIntent);
            }
        });

    }
}