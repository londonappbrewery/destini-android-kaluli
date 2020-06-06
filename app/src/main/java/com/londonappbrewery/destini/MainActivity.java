package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button buttonTop;
    Button buttonBottom;
    TextView story;
    int state;
    int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);
        story = findViewById(R.id.storyTextView);

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 3){
                    story.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);
                }

                if (mIndex == 1 || mIndex == 2){
                    story.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mIndex = 3;
                }
            }
        });

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex == 4){
                    story.setText(R.string.T4_End);
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                }
                if (mIndex == 2) {
                    story.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    mIndex = 4;
                }
                if (mIndex == 3){
                    story.setText(R.string.T5_End);
                    buttonBottom.setVisibility(View.GONE);
                    buttonTop.setVisibility(View.GONE);
                }
                if (mIndex == 1){
                    story.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                    mIndex = 2;
                }
            }
        });
    }
}
