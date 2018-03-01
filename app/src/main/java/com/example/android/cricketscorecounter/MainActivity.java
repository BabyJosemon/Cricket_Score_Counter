package com.example.android.cricketscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runA=0;
    int runB=0;
    int wicketA=0;
    int wicketB=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonB1 = (Button) findViewById(R.id.runB1);
        Button buttonB2 = (Button) findViewById(R.id.runB4);
        Button buttonB3 = (Button) findViewById(R.id.runB6);
        Button buttonB4 = (Button) findViewById(R.id.wicketB_button);
        buttonB1.setClickable(false);
        buttonB2.setClickable(false);
        buttonB3.setClickable(false);
        buttonB4.setClickable(false);
    }
    public void displayArun(int runA) {
        TextView scoreView = (TextView) findViewById(R.id.aRun);
        scoreView.setText(String.valueOf(runA));
    }

    public void displayBrun(int runB) {
        TextView scoreView = (TextView) findViewById(R.id.bRun);
        scoreView.setText(String.valueOf(runB));
    }
    public void displayWicketA(int wicketA) {
        TextView scoreView = (TextView) findViewById(R.id.aWickets);
        scoreView.setText(String.valueOf(wicketA));
    }
    public void displayWicketB(int wicketB) {
        TextView scoreView = (TextView) findViewById(R.id.bWickets);
        scoreView.setText(String.valueOf(wicketB));
    }
    public void runA(View view) {
        displayArun(runA += 1);
    }
    public void run4A(View view) {
        displayArun(runA += 4);
    }
    public void run6A(View view) {
        displayArun(runA += 6);
    }
    public void wicketA(View view) {
        displayWicketA(wicketA += 1);
    }
    public void runB(View view) {
        displayBrun(runB += 1);
    }
    public void run4B(View view) {
        displayBrun(runB += 4);
    }
    public void run6B(View view) {
        displayBrun(runB += 6);
    }
    public void wicketB(View view) {
        displayWicketB(wicketB += 1);
    }
    public void innings(View view){
        Button buttonA1 = (Button) findViewById(R.id.runA1);
        Button buttonA2 = (Button) findViewById(R.id.runA4);
        Button buttonA3 = (Button) findViewById(R.id.runA6);
        Button buttonA4 = (Button) findViewById(R.id.wicketA_button);
        Button buttonB1 = (Button) findViewById(R.id.runB1);
        Button buttonB2 = (Button) findViewById(R.id.runB4);
        Button buttonB3 = (Button) findViewById(R.id.runB6);
        Button buttonB4 = (Button) findViewById(R.id.wicketB_button);
        buttonA1.setClickable(false);
        buttonA2.setClickable(false);
        buttonA3.setClickable(false);
        buttonA4.setClickable(false);
        buttonB1.setClickable(true);
        buttonB2.setClickable(true);
        buttonB3.setClickable(true);
        buttonB4.setClickable(true);
    }
    public void reset(View view){
        displayArun(runA=0);
        displayBrun(runB=0);
        displayWicketA(wicketA=0);
        displayWicketB(wicketB=0);
        Button buttonA1 = (Button) findViewById(R.id.runA1);
        Button buttonA2 = (Button) findViewById(R.id.runA4);
        Button buttonA3 = (Button) findViewById(R.id.runA6);
        Button buttonA4 = (Button) findViewById(R.id.wicketA_button);
        Button buttonB1 = (Button) findViewById(R.id.runB1);
        Button buttonB2 = (Button) findViewById(R.id.runB4);
        Button buttonB3 = (Button) findViewById(R.id.runB6);
        Button buttonB4 = (Button) findViewById(R.id.wicketB_button);
        buttonA1.setClickable(true);
        buttonA2.setClickable(true);
        buttonA3.setClickable(true);
        buttonA4.setClickable(true);
        buttonB1.setClickable(false);
        buttonB2.setClickable(false);
        buttonB3.setClickable(false);
        buttonB4.setClickable(false);
    }
}
