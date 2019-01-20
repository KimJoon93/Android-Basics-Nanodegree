package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView startcussionTeamA;
    TextView startcussionTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startcussionTeamA = (TextView) findViewById(R.id.cussionTeamAstart);
        startcussionTeamB = (TextView) findViewById(R.id.cussionTeamBstart);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void successTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    public void failTeamA(View view) {
        scoreTeamA = scoreTeamA - 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void successTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    public void failTeamB(View view) {
        scoreTeamB = scoreTeamB - 10;
        displayForTeamB(scoreTeamB);
    }

    public void startCussionTeamB(View view) {
        startcussionTeamB.setVisibility(View.VISIBLE);
    }

    public void startCussionTeamA(View view) {
        startcussionTeamA.setVisibility(View.VISIBLE);
    }

    public void resetScore(View view) {
        startcussionTeamA.setVisibility(View.INVISIBLE);
        startcussionTeamB.setVisibility(View.INVISIBLE);
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
}

