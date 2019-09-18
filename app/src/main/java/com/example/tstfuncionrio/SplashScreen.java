package com.example.tstfuncionrio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
       Handler handler = new Handler();
       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
                chamarLogin();
           }
       }, 2000);
    }

    public void chamarLogin(){
        Intent intent = new Intent(SplashScreen.this,MainActivity.class);
    }
}
