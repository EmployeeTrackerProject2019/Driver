package com.example.mi_5.driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        showSplash showSplash = new showSplash();
        showSplash.start();
    }

    private class showSplash extends Thread {
        @Override
        public void run() {
            try {
                sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            startActivity(new Intent(SplashScreen.this, WelcomeActivity.class));
            finish();
        }
    }
}
