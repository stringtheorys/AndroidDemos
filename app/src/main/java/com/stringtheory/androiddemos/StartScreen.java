package com.stringtheory.androiddemos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends Activity {

    Button gestureControl, dynamicLayout, swipeDemo, threadDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);

        gestureControl = (Button) findViewById(R.id.GestureControl);
        dynamicLayout = (Button) findViewById(R.id.DynamicLayout);
        swipeDemo = (Button) findViewById(R.id.swipeDemo);
        threadDemo = (Button) findViewById(R.id.threadDemo);

        gestureControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGestureDemo();
            }
        });
        dynamicLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDynamicDemo();
            }
        });
        swipeDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSwipeDemo();
            }
        });
        threadDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThreadDemo();
            }
        });
    }

    private void goToGestureDemo() {
        Intent intent = new Intent(this, GestureDemo.class);
        startActivity(intent);
    }

    private void goToDynamicDemo() {
        Intent intent = new Intent(this, DynamicDemo.class);
        startActivity(intent);
    }

    private void goToSwipeDemo() {
        Intent intent = new Intent(this, SwipeDemo.class);
        startActivity(intent);
    }

    private void goToThreadDemo() {
        Intent intent = new Intent(this, ThreadDemo.class);
        startActivity(intent);
    }
}
