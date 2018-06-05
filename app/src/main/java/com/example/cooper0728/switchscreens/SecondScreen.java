package com.example.cooper0728.switchscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by cooper0728 on 11/18/2017.
 */

public class SecondScreen extends AppCompatActivity {

    private static final String TAG = "SecondSreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen_layout);
        Log.d(TAG, "onCreate: Starting.");

        //create the button assinged to FirstScreen ID
        Button btnNavToFirst = (Button) findViewById(R.id.btnGoToFirstScreen);

        btnNavToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked");

                Intent intent = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
