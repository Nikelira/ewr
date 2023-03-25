package com.nadershamma.smartlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class SplashScreen3 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen3);

        TextView prop = findViewById(R.id.textView);

        prop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prop = new Intent(SplashScreen3.this,Welcome.class);
                startActivity(prop);
                finish();
            }
        });
    }
    public boolean onTouchEvent(MotionEvent asd){
        switch (asd.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1=asd.getX();
                y1 = asd.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=asd.getX();
                y2 = asd.getY();
                if(x1<x2)
                {
                    Intent qwe = new Intent(SplashScreen3.this, SplashScreen2.class);
                    startActivity(qwe);
                    finish();
                }
                break;
        }
        return false;
    }
}