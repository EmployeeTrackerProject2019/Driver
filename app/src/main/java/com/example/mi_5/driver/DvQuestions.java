package com.example.mi_5.driver;

import java.util.ArrayList;

class DvQuestions {
    private final String name;
    public String image;
    public final ArrayList<String> questions = new ArrayList<>();


    @Override
    public String toString() {
        return name;
    }

    public DvQuestions(String name) {
        this.name = name;
    }
}
