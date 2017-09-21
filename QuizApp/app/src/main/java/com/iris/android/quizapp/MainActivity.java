package com.iris.android.quizapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int point = 0;
    boolean question1 = false;
    boolean question2 = false;
    boolean question3 = false;
    boolean question4 = false;
    boolean question5 = false;
    String resultMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question1() {
        RadioButton questionB = (RadioButton) findViewById(R.id.question_1_b_button);
        if (questionB.isChecked()) {
            point++;
            question1 = true;
        } else {
            question1 = false;
        }

    }

    public void question2() {
        RadioButton questionA = (RadioButton) findViewById(R.id.question_2_a_button);
        if (questionA.isChecked()) {
            point++;
            question2 = true;
        } else {
            question2 = false;
        }
    }

    public void question3() {
        RadioButton questionA = (RadioButton) findViewById(R.id.question_3_a_button);
        if (questionA.isChecked()) {
            point++;
            question3 = true;
        } else {
            question3 = false;
        }
    }


    public void question4() {
        CheckBox questionA = (CheckBox) findViewById(R.id.question_4_a_button);
        CheckBox questionB = (CheckBox) findViewById(R.id.question_4_b_button);
        CheckBox questionC = (CheckBox) findViewById(R.id.question_4_c_button);
        CheckBox questionD = (CheckBox) findViewById(R.id.question_4_d_button);
        if (questionA.isChecked() & questionB.isChecked() & questionC.isChecked() & !(questionD.isChecked())) {
            point++;
            question4 = true;
        } else {
            question4 = false;
        }
    }

    public void question5() {
        EditText question5Ans = (EditText) findViewById(R.id.question_5_answer);
        if (question5Ans.getText().toString().equals(null) || question5Ans.getText().toString().equals("")) {
        } else {
            int answerFor5 = Integer.parseInt(question5Ans.getText().toString());
            if (answerFor5 == 462) {
                point++;
                question5 = true;
            } else {
                question5 = false;
            }
        }
    }



    public void submitAnswer(View view) {
        question1();
        question2();
        question3();
        question4();
        question5();
        resultMessage = getString(R.string.firstQuestionResult) + question1;
        resultMessage = resultMessage + "\n" + getString(R.string.secondQuestionResult) + question2;
        resultMessage = resultMessage + "\n" + getString(R.string.thirdQuestionResult) + question3;
        resultMessage = resultMessage + "\n" + getString(R.string.fourthQuestionResult) + question4;
        resultMessage = resultMessage + "\n" + getString(R.string.fifthQuestionResult) + question5;
        TextView results = (TextView) findViewById(R.id.result);
        results.setText(resultMessage);
        results.setTextColor(Color.parseColor("#FFFFFF"));//use hex code to ch
        //results.setTextColor(this.getResources().getColor(R.color.orange));
        Context context = getApplicationContext();
        CharSequence text = "Total points: " + point;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        point = 0;
    }
}


