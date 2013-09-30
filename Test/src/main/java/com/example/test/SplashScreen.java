package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Forrest on 8/7/13.
 */
public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent openStartingPoint = new Intent("com.example.test.STARTINGPOINT");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }
}
