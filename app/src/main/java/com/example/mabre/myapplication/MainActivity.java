package com.example.mabre.myapplication;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startSignInActivity();
//        new CountDownTimer(5000, 1)
//        {
//            public void onFinish()
//            {
//                startSignInActivity();
//            }
//            public void onTick(long num)
//            {
//
//            }
//        }.start();
    }

    public void startSignInActivity(){
        Intent i = new Intent(this, signin.class);
        startActivity(i);
    }

}
