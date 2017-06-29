package com.stringtheory.androiddemos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThreadDemo extends Activity {

    private TextView timerLabel;
    private Button startTimer;
    private Button resetTimer;
    private long startTime;
    private boolean stopTimer = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threaddemo);

        timerLabel = (TextView) findViewById(R.id.timerlabel);
        startTimer = (Button) findViewById(R.id.startTimerButton);
        resetTimer = (Button) findViewById(R.id.resetTimerButton);

        startTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stopTimer == false && startTime == 0) {
                    startTime = System.currentTimeMillis();
                    startTimer.setText("Stop timer");
                } else if (stopTimer == false && startTime > 0) {

                }
            }
        });
    }
/*
    private void startTimer(){
        new Thread() {
            public void run(){
                while (time < 1000 && !stop){
                    try {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                timerLabel.setText("Time - "+time);
                            }
                        });
                        Thread.sleep(1000);

                    } catch(Exception ex){
                        ex.printStackTrace();
                    }
                    time++;
                }
            }
        }.start();
    }
*/
}
