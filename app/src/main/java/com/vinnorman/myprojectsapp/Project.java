package com.vinnorman.myprojectsapp;

import androidx.annotation.NonNull;

public class Project {

    String name;
    String description;
    int image;

    Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return name + description;
    }
}
