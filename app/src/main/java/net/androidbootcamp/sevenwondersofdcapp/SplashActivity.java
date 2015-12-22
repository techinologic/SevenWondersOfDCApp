package net.androidbootcamp.sevenwondersofdcapp;

/*
 Created by: Paolo Inocencion
 December 22, 2015
 Sources:
 All photos from google images, splashscreen was created using MSPaint.
 Some lines of code are from "PersonalPhotoApp" assingment5.


 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Timer for how long splash screen shows.
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                // Starts MainActivity after timer expires.
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        };
        Timer opening = new Timer();
        // 5500ms = 5.5seconds
        opening.schedule(task, 5500);
    }
}
