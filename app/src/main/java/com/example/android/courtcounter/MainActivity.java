package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
    }

    int team_a_score = 0;
    int team_b_score = 0;

    public void addScore(View add) {
        switch (add.getId()) {
            case (R.id.reset):
                team_a_score = 0;
                team_b_score = 0;
                break;
            case (R.id.a_point_3):
                team_a_score += 3;
                break;
            case (R.id.a_point_2):
                team_a_score += 2;
                break;
            case (R.id.a_point_1):
                team_a_score += 1;
                ;
                break;
            case (R.id.b_point_3):
                team_b_score += 3;
                break;
            case (R.id.b_point_2):
                team_b_score += 2;
                break;
            case (R.id.b_point_1):
                team_b_score += 1;
                break;
        }
        display();
    }

    public void display() {
        TextView a_board = (TextView) findViewById(R.id.a_score);
        a_board.setText(Integer.toString(team_a_score));
        TextView b_board = (TextView) findViewById(R.id.b_score);
        b_board.setText(Integer.toString(team_b_score));
    }
}