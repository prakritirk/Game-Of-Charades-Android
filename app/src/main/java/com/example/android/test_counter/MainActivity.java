package com.example.android.test_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreStark = 0;

    // Tracks the score for Team B
    int scoreTarg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team Stark by 1 point.
     */
    public void minusOneForTeamA(View v) {
        scoreStark = scoreStark - 1;
        displayForTeamA(scoreStark);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreStark = scoreStark + 2;
        displayForTeamA(scoreStark);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreStark = scoreStark + 3;
        displayForTeamA(scoreStark);
    }

    /**
     * Increase the score for Team Targaryn by 1 point.
     */
    public void minusOneForTeamB(View v) {
        scoreTarg = scoreTarg - 1;
        displayForTeamB(scoreTarg);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTarg = scoreTarg + 2;
        displayForTeamB(scoreTarg);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTarg = scoreTarg + 3;
        displayForTeamB(scoreTarg);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreStark = 0;
        scoreTarg = 0;
        displayForTeamA(scoreStark);
        displayForTeamB(scoreTarg);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}