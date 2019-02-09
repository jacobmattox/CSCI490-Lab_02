package com.introtoandroid.intentdemo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class newClickActivity extends AppCompatActivity {

    private ImageView imageOne;
    private ImageView imageTwo;
    private int imageToReturn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_click);
        imageOne = (ImageView) findViewById(R.id.imageView);
        imageTwo = (ImageView) findViewById(R.id.imageView2);

        imageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageToReturn = R.drawable.supermoon;
                finish();
            }
        });
        imageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageToReturn = R.drawable.waterfall;
                finish();
            }
        });
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra(getString(R.string.imageID), imageToReturn);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
