package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    int scoreNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void on_button_click (View view)
    {
        Random ran = new Random();
        int diceNum = ran.nextInt(6 + 1 - 1) + 1;

        EditText userIn = this.findViewById(R.id.input);
        TextView output = this.findViewById(R.id.diceNum);
        TextView score = this.findViewById(R.id.Score);
        String UserInput = userIn.getText().toString();

        int guessNum = Integer.parseInt(UserInput);



        if (guessNum == diceNum)
        {
            scoreNum++;
            score.setText("Score: " + String.valueOf(scoreNum));
            output.setText(Integer.toString(diceNum) + " Correct guess! ");
        } else
            {
                score.setText("Score: " + String.valueOf(scoreNum));
                output.setText("    " + diceNum + " Wrong Guess!");
            }
    }
}