package com.introtoandroid.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int LOOKING_FOR_RETURN = 1;
    private Button setBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setBackground = (Button) findViewById(R.id.setBackground);

        setBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), newClickActivity.class);
                startActivityForResult(i, LOOKING_FOR_RETURN);

            }
        });
            }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == LOOKING_FOR_RETURN && resultCode == Activity.RESULT_OK){
            Bundle extra = data.getExtras();
            if(extra != null){
                int image = extra.getInt(getString(R.string.imageID));
                ConstraintLayout layout = findViewById(R.id.activity_main);
                layout.setBackground(getDrawable(image));
            }


        }
    }
}






