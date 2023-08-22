package com.vinnorman.myprojectsapp;

import androidx.annotation.NonNull;

public class Project {

    String name;
    String descritpion;
    int image;

    Project(String name, String descritpion, int image) {
        this.name = name;
        this.descritpion = descritpion;
        this.image = image;
    }

    @NonNull
    @Override
    public String toString() {
        return name + descritpion;
    }
}
