package com.stringtheory.androiddemos;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;


public class GestureDemo extends Activity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView gesture;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gesturedemo);

        gesture = (TextView)findViewById(R.id.CurrentGesture);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    //////////////// Begin Gestures ////////////////

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gesture.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gesture.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gesture.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        gesture.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gesture.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gesture.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gesture.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gesture.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        gesture.setText("onFling");
        return true;
    }

    //////////////// End Gestures ////////////////

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}