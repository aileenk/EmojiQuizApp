package com.example.android.emojiquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    //Declaring RadioButtons and RadioGroups
    static final String ANSWER_ONE = "answerOne";
    static final String ANSWER_TWO = "answerTwo";
    static final String ANSWER_THREE = "answerThree";
    static final String ANSWER_FOUR = "answerFour";
    static final String ANSWER_FIVE = "answerFive";
    static final String ANSWER_SIX = "answerSix";
    static final String ANSWER_SEVEN = "answerSeven";
    RadioGroup questionOne;
    RadioButton questionOneAnswerOne;
    RadioButton questionOneAnswerTwo;
    RadioButton questionOneAnswerThree;
    RadioButton questionOneAnswerFour;
    String selectedAnswerOne;
    RadioGroup questionTwo;
    RadioButton questionTwoAnswerOne;
    RadioButton questionTwoAnswerTwo;
    RadioButton questionTwoAnswerThree;
    RadioButton questionTwoAnswerFour;
    String selectedAnswerTwo;
    RadioGroup questionThree;
    RadioButton questionThreeAnswerOne;
    RadioButton questionThreeAnswerTwo;
    RadioButton questionThreeAnswerThree;
    RadioButton questionThreeAnswerFour;
    String selectedAnswerThree;
    RadioGroup questionFour;
    RadioButton questionFourAnswerOne;
    RadioButton questionFourAnswerTwo;
    RadioButton questionFourAnswerThree;
    RadioButton questionFourAnswerFour;
    String selectedAnswerFour;
    RadioGroup questionFive;
    RadioButton questionFiveAnswerOne;
    RadioButton questionFiveAnswerTwo;
    RadioButton questionFiveAnswerThree;
    RadioButton questionFiveAnswerFour;
    String selectedAnswerFive;
    RadioGroup questionSix;
    RadioButton questionSixAnswerOne;
    RadioButton questionSixAnswerTwo;
    RadioButton questionSixAnswerThree;
    RadioButton questionSixAnswerFour;
    String selectedAnswerSix;
    RadioGroup questionSeven;
    RadioButton questionSevenAnswerOne;
    RadioButton questionSevenAnswerTwo;
    RadioButton questionSevenAnswerThree;
    RadioButton questionSevenAnswerFour;
    String selectedAnswerSeven;

    //Declaring Question 8
    EditText questionEightAnswer;

    //Declaring Questions 9 and 10
    CheckBox questionNineAnswerOne;
    CheckBox questionNineAnswerTwo;
    CheckBox questionNineAnswerThree;
    CheckBox questionNineAnswerFour;

    CheckBox questionTenAnswerOne;
    CheckBox questionTenAnswerTwo;
    CheckBox questionTenAnswerThree;
    CheckBox questionTenAnswerFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Save instance state for RadioButtons
        if (!TextUtils.isEmpty(selectedAnswerOne)) {
            setRadioButtonState();
        }
        questionOne = findViewById(R.id.questionOneRadioGroup);
        questionOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionOne, int id) {
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
        questionTwo = findViewById(R.id.questionTwoRadioGroup);
        questionTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionTwo, int id) {
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
        questionThree = findViewById(R.id.questionThreeRadioGroup);
        questionThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionThree, int id) {
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
        questionFour = findViewById(R.id.questionFourRadioGroup);
        questionFour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionFour, int id) {
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
        questionFive = findViewById(R.id.questionFiveRadioGroup);
        questionFive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionFive, int id) {
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
        questionSix = findViewById(R.id.questionSixRadioGroup);
        questionSix.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionSix, int id) {
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
        questionSeven = findViewById(R.id.questionSevenRadioGroup);
        questionSeven.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup questionSeven, int id) {
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

        //Initializing Question 8 Answer
        questionEightAnswer = findViewById(R.id.questionEightAnswer);

        //Initializing Checkboxes (Questions 9 and 10)
        questionNineAnswerOne = findViewById(R.id.questionNineAnswerOne);
        questionNineAnswerTwo = findViewById(R.id.questionNineAnswerTwo);
        questionNineAnswerThree = findViewById(R.id.questionNineAnswerThree);
        questionNineAnswerFour = findViewById(R.id.questionNineAnswerFour);

        questionTenAnswerOne = findViewById(R.id.questionTenAnswerOne);
        questionTenAnswerTwo = findViewById(R.id.questionTenAnswerTwo);
        questionTenAnswerThree = findViewById(R.id.questionTenAnswerThree);
        questionTenAnswerFour = findViewById(R.id.questionTenAnswerFour);
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

        //Initializing the correct answers in RadioGroups
        questionOneAnswerThree = findViewById(R.id.questionOneAnswerThreeButton);
        questionTwoAnswerFour = findViewById(R.id.questionTwoAnswerFourButton);
        questionThreeAnswerOne = findViewById(R.id.questionThreeAnswerOneButton);
        questionFourAnswerTwo = findViewById(R.id.questionFourAnswerTwoButton);
        questionFiveAnswerFour = findViewById(R.id.questionFiveAnswerFourButton);
        questionSixAnswerTwo = findViewById(R.id.questionSixAnswerTwoButton);
        questionSevenAnswerOne = findViewById(R.id.questionSevenAnswerOneButton);

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

        // +1 for correct answer
        if (questionEightAnswer.getText().toString().equals("1999")) {
            score++;
        }

        //Calculating score if 3 correct answers are checked and 1 incorrect answer is unchecked
        if (questionNineAnswerOne.isChecked() && questionNineAnswerTwo.isChecked() && !questionNineAnswerThree.isChecked() && questionNineAnswerFour.isChecked()) {
            score++;
        }

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
//Clear radio buttons
        questionOne.clearCheck();
        questionTwo.clearCheck();
        questionThree.clearCheck();
        questionFour.clearCheck();
        questionFive.clearCheck();
        questionSix.clearCheck();
        questionSeven.clearCheck();

        //Clear EditText
        questionEightAnswer.getText().clear();

        //Clear checkboxes
        questionNineAnswerOne.setChecked(false);
        questionNineAnswerTwo.setChecked(false);
        questionNineAnswerThree.setChecked(false);
        questionNineAnswerFour.setChecked(false);

        questionTenAnswerOne.setChecked(false);
        questionTenAnswerTwo.setChecked(false);
        questionTenAnswerThree.setChecked(false);
        questionTenAnswerFour.setChecked(false);
    }
}
