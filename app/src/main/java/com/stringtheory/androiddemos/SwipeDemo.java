package com.stringtheory.androiddemos;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class SwipeDemo extends Activity {
    private GestureDetector gestureScanner;
    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_THRESHOLD_VELOCITY = 150;
    private TextView movementLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipedemo);

        gestureScanner = new GestureDetector(this, simpleOnGestureListener);

        movementLabel = (TextView) findViewById(R.id.movementLabel);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureScanner.onTouchEvent(event);
    }

    GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onDown(MotionEvent event) {
            return true;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float v1, float v2) {

            try {
                if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(v1) > SWIPE_THRESHOLD_VELOCITY) {
                    movementLabel.setText("Swipe left");
                } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(v1) > SWIPE_THRESHOLD_VELOCITY) {
                    movementLabel.setText("Swipe right");
                } else if (e1.getY() - e2.getY() > SWIPE_MIN_DISTANCE && Math.abs(v1) > SWIPE_THRESHOLD_VELOCITY) {
                    movementLabel.setText("Swipe up");
                } else if (e2.getY() - e1.getY() > SWIPE_MIN_DISTANCE && Math.abs(v1) > SWIPE_THRESHOLD_VELOCITY) {
                    movementLabel.setText("Swipe down");
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    };



}
