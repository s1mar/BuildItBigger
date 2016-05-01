package com.s1.libs.android.JokeDisp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DispActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp);
        dispJoke();
    }

    private void dispJoke(){

        ((TextView)findViewById(R.id.jokeDisp)).setText(getIntent().getStringExtra("joke"));


    }
}
