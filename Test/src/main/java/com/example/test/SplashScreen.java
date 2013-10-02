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

        // Sets the loading time
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

        /*
        // Changes the loading dots
        final TextView loadingDots = (TextView) findViewById(R.id.loadingDots);
        Thread loading = new Thread(){
            public void run(){
                try {
                    for (int count = 0; count<=15; count++){
                        if (count % 3 == 0){
                            loadingDots.setText(".");
                        }
                        else if (count % 3 == 1){
                            loadingDots.setText("..");
                        }
                        else {
                            loadingDots.setText("...");
                        sleep(200);
                        }
                    }
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
        loading.start();
        */
    }
}
