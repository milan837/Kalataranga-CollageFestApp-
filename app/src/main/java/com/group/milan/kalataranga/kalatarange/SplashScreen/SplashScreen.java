package com.group.milan.kalataranga.kalatarange.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.group.milan.kalataranga.kalatarange.HomeActivity.HomeActivity;
import com.group.milan.kalataranga.kalatarange.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread splash=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1500);
                    Intent mainActivity=new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(mainActivity);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        splash.start();

    }

}
