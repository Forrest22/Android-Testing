package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    public int count;
    public Button add, subtract, reset;
    public TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        reset = (Button) findViewById(R.id.reset);
        display = (TextView) findViewById(R.id.display);
    }

    public void action (View view){
        Button buttonCall = (Button) view;
        if(buttonCall.equals(add)){
            count++;
        }
        else if(buttonCall.equals(subtract)){
            count--;
        }
        else{
            count = 0;
        }
        display.setText("Your total is " + count);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
