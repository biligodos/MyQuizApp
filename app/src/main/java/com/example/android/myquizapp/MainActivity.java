package com.example.android.myquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText question6AnswerText, question8AnswerText;
    RadioButton question1RadioButton, question2RadioButton, question5RadioButton, question7RadioButton, question10RadioButton;
    CheckBox question3CheckBox1, question3CheckBox2, question3CheckBox3, question3CheckBox4, question3CheckBox5, question3CheckBox6, question3CheckBox7, question4CheckBox1, question4CheckBox2, question4CheckBox3, question4CheckBox4, question4CheckBox5, question4CheckBox6, question9CheckBox1, question9CheckBox2, question9CheckBox3, question9CheckBox4, question9CheckBox5;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is used to submit the answers of the quiz
     * Check only for the button that has the right answer
     * @param view
     */
    public void submitAnswer(View view) {
        score = 0;
        //Question 1
        question1RadioButton = (RadioButton) findViewById(R.id.question1answer1);
        if (question1RadioButton.isChecked()) {
            score++;
        }

        //Question 2
        question2RadioButton = (RadioButton) findViewById(R.id.question2answer3);
        if (question2RadioButton.isChecked()) {
            score++;
        }

        //Question 3
        question3CheckBox1 = (CheckBox) findViewById(R.id.question3answer1);
        question3CheckBox2 = (CheckBox) findViewById(R.id.question3answer2);
        question3CheckBox3 = (CheckBox) findViewById(R.id.question3answer3);
        question3CheckBox4 = (CheckBox) findViewById(R.id.question3answer4);
        question3CheckBox5 = (CheckBox) findViewById(R.id.question3answer5);
        question3CheckBox6 = (CheckBox) findViewById(R.id.question3answer6);
        question3CheckBox7 = (CheckBox) findViewById(R.id.question3answer7);
        if (question3CheckBox1.isChecked() && !question3CheckBox2.isChecked() && question3CheckBox3.isChecked() && !question3CheckBox4.isChecked() && question3CheckBox5.isChecked() && !question3CheckBox6.isChecked() && question3CheckBox7.isChecked()) {
            score++;
        }

        //Question 4
        question4CheckBox1 = (CheckBox) findViewById(R.id.question4answer1);
        question4CheckBox2 = (CheckBox) findViewById(R.id.question4answer2);
        question4CheckBox3 = (CheckBox) findViewById(R.id.question4answer3);
        question4CheckBox4 = (CheckBox) findViewById(R.id.question4answer4);
        question4CheckBox5 = (CheckBox) findViewById(R.id.question4answer5);
        question4CheckBox6 = (CheckBox) findViewById(R.id.question4answer6);
        if (!question4CheckBox1.isChecked() && !question4CheckBox2.isChecked() && question4CheckBox3.isChecked() && question4CheckBox4.isChecked() && !question4CheckBox5.isChecked() && question4CheckBox6.isChecked()) {
            score++;
        }

        //Question 5
        question5RadioButton = (RadioButton) findViewById(R.id.question5answer1);
        if (question5RadioButton.isChecked()) {
            score++;
        }

        //Question 6
        question6AnswerText = (EditText) findViewById(R.id.question6answer);
        String answerQuestion6 = question6AnswerText.getText().toString().toUpperCase().replace(" ", "");
        ;
        if (answerQuestion6.equals("TRUE")) {
            score++;
        }

        //Question 7
        question7RadioButton = (RadioButton) findViewById(R.id.question7answer1);
        if (question7RadioButton.isChecked()) {
            score++;
        }

        //Question 8
        question8AnswerText = (EditText) findViewById(R.id.question8answer);
        String answerQuestion8 = question8AnswerText.getText().toString().toUpperCase().replace(" ", "");
        ;
        if (answerQuestion8.equals("FALSE")) {
            score++;
        }

        //Question 9
        question9CheckBox1 = (CheckBox) findViewById(R.id.question9answer1);
        question9CheckBox2 = (CheckBox) findViewById(R.id.question9answer2);
        question9CheckBox3 = (CheckBox) findViewById(R.id.question9answer3);
        question9CheckBox4 = (CheckBox) findViewById(R.id.question9answer4);
        question9CheckBox5 = (CheckBox) findViewById(R.id.question9answer5);
        if (question9CheckBox5.isChecked()) {
            score++;
        }

        //Question 10
        question10RadioButton = (RadioButton) findViewById(R.id.question10answer1);
        if (question10RadioButton.isChecked()) {
            score++;
        }

        //Result
        if (score >= 9) {
            Toast toast = Toast.makeText(this, "Perfect!\n" + "You got\n" + score + " out of 10", Toast.LENGTH_SHORT);
            LinearLayout toastLayout = (LinearLayout) toast.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toast.setGravity(Gravity.CENTER, 50, 50);
            toastTV.setTextSize(getResources().getDimension(R.dimen.toast_text_size));
            toastTV.setTextAlignment(view.TEXT_ALIGNMENT_CENTER);
            toast.show();
        } else if (score >= 6) {
            Toast toast = Toast.makeText(this, "Good job!\n" + "You got\n" + score + " out of 10", Toast.LENGTH_SHORT);
            LinearLayout toastLayout = (LinearLayout) toast.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toast.setGravity(Gravity.CENTER, 50, 50);
            toastTV.setTextSize(getResources().getDimension(R.dimen.toast_text_size));
            toastTV.setTextAlignment(view.TEXT_ALIGNMENT_CENTER);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Try again!\n" + "You got\n" + score + " out of 10", Toast.LENGTH_SHORT);
            LinearLayout toastLayout = (LinearLayout) toast.getView();
            TextView toastTV = (TextView) toastLayout.getChildAt(0);
            toast.setGravity(Gravity.CENTER, 50, 50);
            toastTV.setTextSize(getResources().getDimension(R.dimen.toast_text_size));
            toastTV.setTextAlignment(view.TEXT_ALIGNMENT_CENTER);
            toast.show();
        }
    }

    /**
     * This method is used to reset the answers of the quiz
     *
     * @param v
     */
    public void resetAnswer(View v) {
        score = 0;
        ((RadioGroup)findViewById(R.id.radiogroup1)).clearCheck();
        ((RadioGroup)findViewById(R.id.radiogroup2)).clearCheck();
        ((CheckBox) findViewById(R.id.question3answer1)).setChecked(false);
        ((CheckBox) findViewById(R.id.question3answer2)).setChecked(false);
        ((CheckBox) findViewById(R.id.question3answer3)).setChecked(false);
        ((CheckBox) findViewById(R.id.question3answer4)).setChecked(false);
        ((CheckBox) findViewById(R.id.question3answer5)).setChecked(false);
        ((CheckBox) findViewById(R.id.question3answer6)).setChecked(false);
        ((CheckBox) findViewById(R.id.question3answer7)).setChecked(false);
        ((CheckBox) findViewById(R.id.question4answer1)).setChecked(false);
        ((CheckBox) findViewById(R.id.question4answer2)).setChecked(false);
        ((CheckBox) findViewById(R.id.question4answer3)).setChecked(false);
        ((CheckBox) findViewById(R.id.question4answer4)).setChecked(false);
        ((CheckBox) findViewById(R.id.question4answer5)).setChecked(false);
        ((CheckBox) findViewById(R.id.question4answer6)).setChecked(false);
        ((RadioGroup)findViewById(R.id.radiogroup5)).clearCheck();
        ((EditText) findViewById(R.id.question6answer)).setText("");
        ((RadioGroup)findViewById(R.id.radiogroup7)).clearCheck();
        ((EditText) findViewById(R.id.question8answer)).setText("");
        ((CheckBox) findViewById(R.id.question9answer1)).setChecked(false);
        ((CheckBox) findViewById(R.id.question9answer2)).setChecked(false);
        ((CheckBox) findViewById(R.id.question9answer3)).setChecked(false);
        ((CheckBox) findViewById(R.id.question9answer4)).setChecked(false);
        ((CheckBox) findViewById(R.id.question9answer5)).setChecked(false);
        ((RadioGroup)findViewById(R.id.radiogroup10)).clearCheck();

    }
}