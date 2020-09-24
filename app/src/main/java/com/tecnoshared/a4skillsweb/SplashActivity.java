package com.tecnoshared.a4skillsweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.tecnoshared.a4skillsweb.VerifyEmail.VerifyEmail;

public class SplashActivity extends AppCompatActivity {
    private ImageView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splash = findViewById(R.id.img_gif);
        Glide.with(this).load(R.drawable.splash).centerCrop().into(splash);
        launcherNextActivity();
    }
    private void launcherNextActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, VerifyEmail.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);//Genera la animacion entre la transición de las activities
                finish();
            }
        }, 2000); //wait 2 seg
    }
}