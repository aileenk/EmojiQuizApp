package com.example.android.emojiquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.text.TextUtils;


public class MainActivity extends AppCompatActivity {
    //Starting score is 0
    int score = 0;

    //declaring to save instance state of radio buttons
    private static final String ANSWER_ONE = "answerOne";
    private static final String ANSWER_TWO = "answerTwo";
    private static final String ANSWER_THREE = "answerThree";
    private static final String ANSWER_FOUR = "answerFour";
    private static final String ANSWER_FIVE = "answerFive";
    private static final String ANSWER_SIX = "answerSix";
    private static final String ANSWER_SEVEN = "answerSeven";

    private RadioButton questionOneAnswerOne;
    private RadioButton questionOneAnswerTwo;
    private RadioButton questionOneAnswerThree;
    private RadioButton questionOneAnswerFour;
    private String selectedAnswerOne;

    private RadioButton questionTwoAnswerOne;
    private RadioButton questionTwoAnswerTwo;
    private RadioButton questionTwoAnswerThree;
    private RadioButton questionTwoAnswerFour;
    private String selectedAnswerTwo;

    private RadioButton questionThreeAnswerOne;
    private RadioButton questionThreeAnswerTwo;
    private RadioButton questionThreeAnswerThree;
    private RadioButton questionThreeAnswerFour;
    private String selectedAnswerThree;

    private RadioButton questionFourAnswerOne;
    private RadioButton questionFourAnswerTwo;
    private RadioButton questionFourAnswerThree;
    private RadioButton questionFourAnswerFour;
    private String selectedAnswerFour;

    private RadioButton questionFiveAnswerOne;
    private RadioButton questionFiveAnswerTwo;
    private RadioButton questionFiveAnswerThree;
    private RadioButton questionFiveAnswerFour;
    private String selectedAnswerFive;

    private RadioButton questionSixAnswerOne;
    private RadioButton questionSixAnswerTwo;
    private RadioButton questionSixAnswerThree;
    private RadioButton questionSixAnswerFour;
    private String selectedAnswerSix;

    private RadioButton questionSevenAnswerOne;
    private RadioButton questionSevenAnswerTwo;
    private RadioButton questionSevenAnswerThree;
    private RadioButton questionSevenAnswerFour;
    private String selectedAnswerSeven;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Save instance state for radio buttons
        if (!TextUtils.isEmpty(selectedAnswerOne)) {
            setRadioButtonState();
        }
        final RadioGroup questionOneRG = findViewById(R.id.questionOneRadioGroup);
        questionOneRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionOneRG, int id) {
                if (id == R.id.questionOneAnswerOneButton) {
                    selectedAnswerOne = "ONE";
                }
                if (id == R.id.questionOneAnswerTwoButton) {
                    selectedAnswerOne = "TWO";
                }
                if (id == R.id.questionOneAnswerThreeButton) {
                    selectedAnswerOne = "THREE";
                }
                if (id == R.id.questionOneAnswerFourButton) {
                    selectedAnswerOne = "FOUR";
                }
            }
        });

        if (!TextUtils.isEmpty(selectedAnswerTwo)) {
            setRadioButtonState();
        }
        final RadioGroup questionTwoRG = findViewById(R.id.questionTwoRadioGroup);
        questionTwoRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionTwoRG, int id) {
                if (id == R.id.questionTwoAnswerOneButton) {
                    selectedAnswerTwo = "ONE";
                }
                if (id == R.id.questionTwoAnswerTwoButton) {
                    selectedAnswerTwo = "TWO";
                }
                if (id == R.id.questionTwoAnswerThreeButton) {
                    selectedAnswerTwo = "THREE";
                }
                if (id == R.id.questionTwoAnswerFourButton) {
                    selectedAnswerTwo = "FOUR";
                }
            }
        });

        if (!TextUtils.isEmpty(selectedAnswerThree)) {
            setRadioButtonState();
        }
        final RadioGroup questionThreeRG = findViewById(R.id.questionThreeRadioGroup);
        questionThreeRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionThreeRG, int id) {
                if (id == R.id.questionThreeAnswerOneButton) {
                    selectedAnswerThree = "ONE";
                }
                if (id == R.id.questionThreeAnswerTwoButton) {
                    selectedAnswerThree = "TWO";
                }
                if (id == R.id.questionThreeAnswerThreeButton) {
                    selectedAnswerThree = "THREE";
                }
                if (id == R.id.questionThreeAnswerFourButton) {
                    selectedAnswerThree = "FOUR";
                }
            }
        });

        if (!TextUtils.isEmpty(selectedAnswerFour)) {
            setRadioButtonState();
        }
        final RadioGroup questionFourRG = findViewById(R.id.questionFourRadioGroup);
        questionFourRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionFourRG, int id) {
                if (id == R.id.questionFourAnswerOneButton) {
                    selectedAnswerFour = "ONE";
                }
                if (id == R.id.questionFourAnswerTwoButton) {
                    selectedAnswerFour = "TWO";
                }
                if (id == R.id.questionFourAnswerThreeButton) {
                    selectedAnswerFour = "THREE";
                }
                if (id == R.id.questionFourAnswerFourButton) {
                    selectedAnswerFour = "FOUR";
                }
            }
        });

        if (!TextUtils.isEmpty(selectedAnswerFive)) {
            setRadioButtonState();
        }
        final RadioGroup questionFiveRG = findViewById(R.id.questionFiveRadioGroup);
        questionFiveRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionFiveRG, int id) {
                if (id == R.id.questionFiveAnswerOneButton) {
                    selectedAnswerFive = "ONE";
                }
                if (id == R.id.questionFiveAnswerTwoButton) {
                    selectedAnswerFive = "TWO";
                }
                if (id == R.id.questionFiveAnswerThreeButton) {
                    selectedAnswerFive = "THREE";
                }
                if (id == R.id.questionFiveAnswerFourButton) {
                    selectedAnswerFive = "FOUR";
                }
            }
        });

        if (!TextUtils.isEmpty(selectedAnswerSix)) {
            setRadioButtonState();
        }
        final RadioGroup questionSixRG = findViewById(R.id.questionSixRadioGroup);
        questionSixRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionSixRG, int id) {
                if (id == R.id.questionSixAnswerOneButton) {
                    selectedAnswerSix = "ONE";
                }
                if (id == R.id.questionSixAnswerTwoButton) {
                    selectedAnswerSix = "TWO";
                }
                if (id == R.id.questionSixAnswerThreeButton) {
                    selectedAnswerSix = "THREE";
                }
                if (id == R.id.questionSixAnswerFourButton) {
                    selectedAnswerSix = "FOUR";
                }
            }
        });

        if (!TextUtils.isEmpty(selectedAnswerSeven)) {
            setRadioButtonState();
        }
        final RadioGroup questionSevenRG = findViewById(R.id.questionSevenRadioGroup);
        questionSevenRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionSevenRG, int id) {
                if (id == R.id.questionSevenAnswerOneButton) {
                    selectedAnswerSeven = "ONE";
                }
                if (id == R.id.questionSevenAnswerTwoButton) {
                    selectedAnswerSeven = "TWO";
                }
                if (id == R.id.questionSevenAnswerThreeButton) {
                    selectedAnswerSeven = "THREE";
                }
                if (id == R.id.questionSevenAnswerFourButton) {
                    selectedAnswerSeven = "FOUR";
                }
            }
        });
    }

    //Save instance state for radio buttons
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        selectedAnswerOne = savedInstanceState.getString(ANSWER_ONE);
        selectedAnswerTwo = savedInstanceState.getString(ANSWER_TWO);
        selectedAnswerThree = savedInstanceState.getString(ANSWER_THREE);
        selectedAnswerFour = savedInstanceState.getString(ANSWER_FOUR);
        selectedAnswerFive = savedInstanceState.getString(ANSWER_FIVE);
        selectedAnswerSix = savedInstanceState.getString(ANSWER_SIX);
        selectedAnswerSeven = savedInstanceState.getString(ANSWER_SEVEN);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (!TextUtils.isEmpty(selectedAnswerOne)) {
            outState.putString(ANSWER_ONE, selectedAnswerOne);
        }
        super.onSaveInstanceState(outState);

        if (!TextUtils.isEmpty(selectedAnswerTwo)) {
            outState.putString(ANSWER_TWO, selectedAnswerTwo);
        }
        super.onSaveInstanceState(outState);

        if (!TextUtils.isEmpty(selectedAnswerThree)) {
            outState.putString(ANSWER_THREE, selectedAnswerThree);
        }
        super.onSaveInstanceState(outState);

        if (!TextUtils.isEmpty(selectedAnswerFour)) {
            outState.putString(ANSWER_FOUR, selectedAnswerFour);
        }
        super.onSaveInstanceState(outState);

        if (!TextUtils.isEmpty(selectedAnswerFive)) {
            outState.putString(ANSWER_FIVE, selectedAnswerFive);
        }
        super.onSaveInstanceState(outState);

        if (!TextUtils.isEmpty(selectedAnswerSix)) {
            outState.putString(ANSWER_SIX, selectedAnswerSix);
        }
        super.onSaveInstanceState(outState);

        if (!TextUtils.isEmpty(selectedAnswerSeven)) {
            outState.putString(ANSWER_SEVEN, selectedAnswerSeven);
        }
        super.onSaveInstanceState(outState);
    }

    //Save instance state for radio buttons
    private void setRadioButtonState() {
        if (selectedAnswerOne.equals("ONE")) {
            questionOneAnswerOne.setChecked(true);
        }
        if (selectedAnswerOne.equals("TWO")) {
            questionOneAnswerTwo.setChecked(true);
        }
        if (selectedAnswerOne.equals("THREE")) {
            questionOneAnswerThree.setChecked(true);
        }
        if (selectedAnswerOne.equals("FOUR")) {
            questionOneAnswerFour.setChecked(true);
        }

        if (selectedAnswerTwo.equals("ONE")) {
            questionTwoAnswerOne.setChecked(true);
        }
        if (selectedAnswerTwo.equals("TWO")) {
            questionTwoAnswerTwo.setChecked(true);
        }
        if (selectedAnswerTwo.equals("THREE")) {
            questionTwoAnswerThree.setChecked(true);
        }
        if (selectedAnswerTwo.equals("FOUR")) {
            questionTwoAnswerFour.setChecked(true);
        }

        if (selectedAnswerThree.equals("ONE")) {
            questionThreeAnswerOne.setChecked(true);
        }
        if (selectedAnswerThree.equals("TWO")) {
            questionThreeAnswerTwo.setChecked(true);
        }
        if (selectedAnswerThree.equals("THREE")) {
            questionThreeAnswerThree.setChecked(true);
        }
        if (selectedAnswerThree.equals("FOUR")) {
            questionThreeAnswerFour.setChecked(true);
        }

        if (selectedAnswerFour.equals("ONE")) {
            questionFourAnswerOne.setChecked(true);
        }
        if (selectedAnswerFour.equals("TWO")) {
            questionFourAnswerTwo.setChecked(true);
        }
        if (selectedAnswerFour.equals("THREE")) {
            questionFourAnswerThree.setChecked(true);
        }
        if (selectedAnswerFour.equals("FOUR")) {
            questionFourAnswerFour.setChecked(true);
        }

        if (selectedAnswerFive.equals("ONE")) {
            questionFiveAnswerOne.setChecked(true);
        }
        if (selectedAnswerFive.equals("TWO")) {
            questionFiveAnswerTwo.setChecked(true);
        }
        if (selectedAnswerFive.equals("THREE")) {
            questionFiveAnswerThree.setChecked(true);
        }
        if (selectedAnswerFive.equals("FOUR")) {
            questionFiveAnswerFour.setChecked(true);
        }

        if (selectedAnswerSix.equals("ONE")) {
            questionSixAnswerOne.setChecked(true);
        }
        if (selectedAnswerSix.equals("TWO")) {
            questionSixAnswerTwo.setChecked(true);
        }
        if (selectedAnswerSix.equals("THREE")) {
            questionSixAnswerThree.setChecked(true);
        }
        if (selectedAnswerSix.equals("FOUR")) {
            questionSixAnswerFour.setChecked(true);
        }

        if (selectedAnswerSeven.equals("ONE")) {
            questionSevenAnswerOne.setChecked(true);
        }
        if (selectedAnswerSeven.equals("TWO")) {
            questionSevenAnswerTwo.setChecked(true);
        }
        if (selectedAnswerSeven.equals("THREE")) {
            questionSevenAnswerThree.setChecked(true);
        }
        if (selectedAnswerSeven.equals("FOUR")) {
            questionSevenAnswerFour.setChecked(true);
        }
    }

    //When user clicks "Submit Answer" button
    public void submitAnswers(View view) {

        //Identifying the correct answers in RadioGroups
        RadioButton questionOneAnswerThree = findViewById(R.id.questionOneAnswerThreeButton);
        RadioButton questionTwoAnswerFour = findViewById(R.id.questionTwoAnswerFourButton);
        RadioButton questionThreeAnswerOne = findViewById(R.id.questionThreeAnswerOneButton);
        RadioButton questionFourAnswerTwo = findViewById(R.id.questionFourAnswerTwoButton);
        RadioButton questionFiveAnswerFour = findViewById(R.id.questionFiveAnswerFourButton);
        RadioButton questionSixAnswerTwo = findViewById(R.id.questionSixAnswerTwoButton);
        RadioButton questionSevenAnswerOne = findViewById(R.id.questionSevenAnswerOneButton);

        //Calculating score questions 1-7
        if (questionOneAnswerThree.isChecked()) {
            score++;
        }

        if (questionTwoAnswerFour.isChecked()) {
            score++;
        }

        if (questionThreeAnswerOne.isChecked()) {
            score++;
        }

        if (questionFourAnswerTwo.isChecked()) {
            score++;
        }

        if (questionFiveAnswerFour.isChecked()) {
            score++;
        }

        if (questionSixAnswerTwo.isChecked()) {
            score++;
        }

        if (questionSevenAnswerOne.isChecked()) {
            score++;
        }

        //Question 8 correct answer
        EditText questionEightAnswer = findViewById(R.id.questionEightAnswer);
        // +1 for correct answer
        if (questionEightAnswer.getText().toString().equals("1999")) {
            score++;
        }

        //Identifying checked answers in checkboxes
        CheckBox questionNineAnswerOne = findViewById(R.id.questionNineAnswerOne);
        CheckBox questionNineAnswerTwo = findViewById(R.id.questionNineAnswerTwo);
        CheckBox questionNineAnswerThree = findViewById(R.id.questionNineAnswerThree);
        CheckBox questionNineAnswerFour = findViewById(R.id.questionNineAnswerFour);

        CheckBox questionTenAnswerOne = findViewById(R.id.questionTenAnswerOne);
        CheckBox questionTenAnswerTwo = findViewById(R.id.questionTenAnswerTwo);
        CheckBox questionTenAnswerThree = findViewById(R.id.questionTenAnswerThree);
        CheckBox questionTenAnswerFour = findViewById(R.id.questionTenAnswerFour);

        //Calculating score if 3 correct answers are checked and 1 incorrect answer is unchecked
        if (questionNineAnswerOne.isChecked() && questionNineAnswerTwo.isChecked() && !questionNineAnswerThree.isChecked() && questionNineAnswerFour.isChecked()) {
            score++;
        }

        //Calculating score if 3 correct answers are checked and 1 incorrect answer is unchecked
        if (!questionTenAnswerOne.isChecked() && questionTenAnswerTwo.isChecked() && questionTenAnswerThree.isChecked() && questionTenAnswerFour.isChecked()) {
            score++;
        }

        //Toast message with score
        Toast.makeText(this, "Your score: " + score + " out of 10 correct!", Toast.LENGTH_LONG).show();

        score = 0;
    }

    //When user clicks "Reset" button
    public void reset(View view) {
        //Clear radio buttons
        RadioGroup questionOne = findViewById(R.id.questionOneRadioGroup);
        questionOne.clearCheck();
        RadioGroup questionTwo = findViewById(R.id.questionTwoRadioGroup);
        questionTwo.clearCheck();
        RadioGroup questionThree = findViewById(R.id.questionThreeRadioGroup);
        questionThree.clearCheck();
        RadioGroup questionFour = findViewById(R.id.questionFourRadioGroup);
        questionFour.clearCheck();
        RadioGroup questionFive = findViewById(R.id.questionFiveRadioGroup);
        questionFive.clearCheck();
        RadioGroup questionSix = findViewById(R.id.questionSixRadioGroup);
        questionSix.clearCheck();
        RadioGroup questionSeven = findViewById(R.id.questionSevenRadioGroup);
        questionSeven.clearCheck();

        //Clear EditText
        EditText questionEightAnswer = findViewById(R.id.questionEightAnswer);
        questionEightAnswer.getText().clear();

        //Clear checkboxes
        CheckBox questionNineAnswerOne = findViewById(R.id.questionNineAnswerOne);
        CheckBox questionNineAnswerTwo = findViewById(R.id.questionNineAnswerTwo);
        CheckBox questionNineAnswerThree = findViewById(R.id.questionNineAnswerThree);
        CheckBox questionNineAnswerFour = findViewById(R.id.questionNineAnswerFour);
        questionNineAnswerOne.setChecked(false);
        questionNineAnswerTwo.setChecked(false);
        questionNineAnswerThree.setChecked(false);
        questionNineAnswerFour.setChecked(false);

        CheckBox questionTenAnswerOne = findViewById(R.id.questionTenAnswerOne);
        CheckBox questionTenAnswerTwo = findViewById(R.id.questionTenAnswerTwo);
        CheckBox questionTenAnswerThree = findViewById(R.id.questionTenAnswerThree);
        CheckBox questionTenAnswerFour = findViewById(R.id.questionTenAnswerFour);
        questionTenAnswerOne.setChecked(false);
        questionTenAnswerTwo.setChecked(false);
        questionTenAnswerThree.setChecked(false);
        questionTenAnswerFour.setChecked(false);
    }
}
