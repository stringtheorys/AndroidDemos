package com.stringtheory.androiddemos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class DynamicDemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(setAllJavaLayout());
    }

    private RelativeLayout setAllJavaLayout(){

        //Main Layout very thing is based off this
        RelativeLayout mainLayout = new RelativeLayout(this);

        //Button
        Button redButton = new Button(this);
        redButton.setText("log in");
        redButton.setBackgroundColor(Color.RED);

        //Input
        EditText username = new EditText(this);

        redButton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Give rules to position widgets

        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Add widgets to layout


        mainLayout.addView(redButton, buttonDetails);
        mainLayout.addView(username, usernameDetails);

        return mainLayout;
    }

    private GridLayout setBoardLayout(){
        GridLayout mainLayout = new GridLayout(this);

        Button[][] board = new Button[4][4];
        for (int x = 0; x < 4; x++){
            for (int y = 0; y < 4; y++){
                Button button = new Button(this);
                board[x][y] = button;

                button.setText("Text"+x+", "+y);
                button.setBackgroundColor(Color.BLUE);

                mainLayout.addView(button);
            }
        }
        return mainLayout;
    }

    private LinearLayout setListButtonLayouts(){
        LinearLayout mainLayout = new LinearLayout(this);

        for (int i = 0; i < 5; i++){
            Button button = new Button(this);

            button.setText("Text");
            button.setBackgroundColor(Color.RED);

            mainLayout.addView(button);

        }


        return mainLayout;
    }


}
