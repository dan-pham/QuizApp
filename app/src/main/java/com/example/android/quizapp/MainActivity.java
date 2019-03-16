package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitQuiz(View view) {

        //Question 1
        CheckBox questionOneACheckBox = (CheckBox) findViewById(R.id.question_one_a_checkbox);
        CheckBox questionOneBCheckBox = (CheckBox) findViewById(R.id.question_one_b_checkbox);
        CheckBox questionOneCCheckBox = (CheckBox) findViewById(R.id.question_one_c_checkbox);
        CheckBox questionOneDCheckBox = (CheckBox) findViewById(R.id.question_one_d_checkbox);
        CheckBox questionOneECheckBox = (CheckBox) findViewById(R.id.question_one_e_checkbox);
        boolean questionOneAIsChecked = questionOneACheckBox.isChecked();
        boolean questionOneBIsChecked = questionOneBCheckBox.isChecked();
        boolean questionOneCIsChecked = questionOneCCheckBox.isChecked();
        boolean questionOneDIsChecked = questionOneDCheckBox.isChecked();
        boolean questionOneEIsChecked = questionOneECheckBox.isChecked();

        if (questionOneAIsChecked && questionOneCIsChecked && !questionOneBIsChecked && !questionOneDIsChecked && !questionOneEIsChecked) {
            score += 1;
        }

        //Question 2
        CheckBox questionTwoACheckBox = (CheckBox) findViewById(R.id.question_two_a_checkbox);
        CheckBox questionTwoBCheckBox = (CheckBox) findViewById(R.id.question_two_b_checkbox);
        CheckBox questionTwoCCheckBox = (CheckBox) findViewById(R.id.question_two_c_checkbox);
        CheckBox questionTwoDCheckBox = (CheckBox) findViewById(R.id.question_two_d_checkbox);
        CheckBox questionTwoECheckBox = (CheckBox) findViewById(R.id.question_two_e_checkbox);
        boolean questionTwoAIsChecked = questionTwoACheckBox.isChecked();
        boolean questionTwoBIsChecked = questionTwoBCheckBox.isChecked();
        boolean questionTwoCIsChecked = questionTwoCCheckBox.isChecked();
        boolean questionTwoDIsChecked = questionTwoDCheckBox.isChecked();
        boolean questionTwoEIsChecked = questionTwoECheckBox.isChecked();

        if (questionTwoBIsChecked && questionTwoCIsChecked && !questionTwoAIsChecked && !questionTwoDIsChecked && !questionTwoEIsChecked) {
            score += 1;
        }

        //Question 3
        RadioButton questionThreeCRadioButton = (RadioButton) findViewById(R.id.question_three_c_radio);
        boolean questionThreeCIsChecked = questionThreeCRadioButton.isChecked();

        if (questionThreeCIsChecked) {
            score += 1;
        }

        //Question 4
        RadioButton questionFourCRadioButton = (RadioButton) findViewById(R.id.question_four_c_radio);
        boolean questionFourCIsChecked = questionFourCRadioButton.isChecked();

        if (questionFourCIsChecked) {
            score += 1;
        }

        //Question 5
        EditText questionFiveTextField = (EditText) findViewById(R.id.question_five);
        String questionFiveAnswer = questionFiveTextField.getText().toString().toUpperCase();
        String answer = "DIARY RING LOCKET CUP DIADEM HARRY NAGINI";

        if (questionFiveAnswer.equals(answer)) {
            score += 1;
        }

        //Score
        if (score == 5) {
            Toast.makeText(this, R.string.score_five_toast, Toast.LENGTH_LONG).show();
        } else if (score == 4) {
            Toast.makeText(this, R.string.score_four_toast, Toast.LENGTH_LONG).show();
        } else if (score == 3) {
            Toast.makeText(this, R.string.score_three_toast, Toast.LENGTH_LONG).show();
        } else if (score == 2) {
            Toast.makeText(this, R.string.score_two_toast, Toast.LENGTH_LONG).show();
        } else if (score == 1) {
            Toast.makeText(this, R.string.score_one_toast, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, R.string.score_zero_toast, Toast.LENGTH_LONG).show();
        }
    }
}
