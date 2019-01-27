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

    RadioButton oneblueradio;
    RadioButton twogreenradio;
    RadioButton thryellowradio;
    RadioButton fouwhiteradio;
    RadioButton fivorangeradio;

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
        oneblueradio = (RadioButton)findViewById(R.id.one_blue_radio);
        twogreenradio = (RadioButton)findViewById(R.id.two_green_radio);
        thryellowradio = (RadioButton)findViewById(R.id.thr_yellow_radio);
        fouwhiteradio = (RadioButton)findViewById(R.id.fou_white_radio);
        fivorangeradio = (RadioButton)findViewById(R.id.fiv_orange_radio);

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

        if(oneblueradio.isChecked()){
            score = score + 20;
            q_one.setText("O");
            q_one.setTextColor(getResources().getColor(R.color.Green));
        }
        if(twogreenradio.isChecked()){
            score = score + 20;
            q_two.setText("O");
            q_two.setTextColor(getResources().getColor(R.color.Green));
        }
        if(thryellowradio.isChecked()){
            score = score + 20;
            q_three.setText("O");
            q_three.setTextColor(getResources().getColor(R.color.Green));
        }
        if(fouwhiteradio.isChecked()){
            score = score + 20;
            q_four.setText("O");
            q_four.setTextColor(getResources().getColor(R.color.Green));
        }
        if(fivorangeradio.isChecked()){
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
