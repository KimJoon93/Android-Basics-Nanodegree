package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    String username;

    LinearLayout scorelayout;

    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    RadioButton answer5;

    CheckBox selfcheck;

    EditText nameEdit;

    TextView q_one;
    TextView q_two;
    TextView q_three;
    TextView q_four;
    TextView q_five;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1 = (RadioButton)findViewById(R.id.answer1);
        answer2 = (RadioButton)findViewById(R.id.answer2);
        answer3 = (RadioButton)findViewById(R.id.answer3);
        answer4 = (RadioButton)findViewById(R.id.answer4);
        answer5 = (RadioButton)findViewById(R.id.answer5);

        q_one = (TextView) findViewById(R.id.one);
        q_two = (TextView) findViewById(R.id.two);
        q_three = (TextView) findViewById(R.id.three);
        q_four = (TextView) findViewById(R.id.four);
        q_five = (TextView) findViewById(R.id.five);

        nameEdit = (EditText) findViewById(R.id.name_edittext);

        selfcheck = (CheckBox) findViewById(R.id.selfsolve_checkbox);

        scorelayout = (LinearLayout) findViewById(R.id.scorelayout);

    }

    public void ScoreClick(View view){
        if(!selfcheck.isChecked()){
            Toast.makeText(this, "Please solve problems by your self!",Toast.LENGTH_LONG).show();
            return;
        }

        if(answer1.isChecked()){
            score = score + 20;
            q_one.setText("O");
            q_one.setTextColor(getResources().getColor(R.color.Green));
        }
        if(answer2.isChecked()){
            score = score + 20;
            q_two.setText("O");
            q_two.setTextColor(getResources().getColor(R.color.Green));
        }
        if(answer3.isChecked()){
            score = score + 20;
            q_three.setText("O");
            q_three.setTextColor(getResources().getColor(R.color.Green));
        }
        if(answer4.isChecked()){
            score = score + 20;
            q_four.setText("O");
            q_four.setTextColor(getResources().getColor(R.color.Green));
        }
        if(answer5.isChecked()){
            score = score + 20;
            q_five.setText("O");
            q_five.setTextColor(getResources().getColor(R.color.Green));
        }
        username = nameEdit.getText().toString();
        Toast.makeText(this, username +"! you got "+ score+ "Points!",Toast.LENGTH_LONG).show();
        scorelayout.setVisibility(View.VISIBLE);
        score = 0;
    }
}
