package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void threePointerA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointerA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void threePointerB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointerB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    // Resets scores for both teams to 0
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
