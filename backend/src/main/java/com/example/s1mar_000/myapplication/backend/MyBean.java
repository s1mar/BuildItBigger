package com.example.s1mar_000.myapplication.backend;

import com.s1.libs.java.joker.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return myData= (Jokes.getJoke());
    }

    public void setData(String data) {
        myData = data;
    }
}