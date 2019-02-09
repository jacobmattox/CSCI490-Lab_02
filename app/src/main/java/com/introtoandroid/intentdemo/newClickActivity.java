package com.introtoandroid.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class newClickActivity extends AppCompatActivity {

    private ImageView imageOne;
    private ImageView imageTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_click);
    }
}
