package com.example.cutomtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup container = (ViewGroup) findViewById(R.id.container);
        CustomTextView customTextView_lime = new CustomTextView(this,
                "Lime",
                R.color.lime);

        CustomTextView customTextView_purple = new CustomTextView(this,
                "Purple",
                R.color.purple);

        CustomTextView customTextView_orange = new CustomTextView(this,
                "Orange",
                R.color.orange);

        container.addView(customTextView_lime);
        container.addView(customTextView_purple);
        container.addView(customTextView_orange);


    }
}