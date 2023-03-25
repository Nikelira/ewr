package com.nadershamma.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent rainIntent = new Intent(SplashScreen.this, SplashScreen1.class);
                SplashScreen.this.startActivity(rainIntent);
                SplashScreen.this.finish();
            }
        },SPLASH_DISPLAY);
    }
    public void onBack(){
        super.onBackPressed();
    }

}

