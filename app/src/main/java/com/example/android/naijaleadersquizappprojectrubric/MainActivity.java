package com.example.android.naijaleadersquizappprojectrubric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 10;
    int totalCorrectAnswers = 0;
    int totalAttemptedQuestions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * this method is called when the submit quiz button is clicked
     * it summarizes the quiz results and displays it as a Toast
     */

    public void quizSummary(View view) {

        /**
         * This Section Counts the radio buttons checked and displays the number on a TextView
         */


        //Check if any radio button in the question one group is checked
        RadioGroup questionOneOptions = (RadioGroup) findViewById(R.id.questionOneRadioGroup);
        boolean questionOneGroups = questionOneOptions.isEnabled();
        if (questionOneGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question two group is checked
        RadioGroup questionTwoOptions = (RadioGroup) findViewById(R.id.questionTwoRadioGroup);
        boolean questionTwoGroups = questionTwoOptions.isEnabled();
        if (questionTwoGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question three group is checked
        RadioGroup questionThreeOptions = (RadioGroup) findViewById(R.id.questionThreeRadioGroup);
        boolean questionThreeGroups = questionThreeOptions.isEnabled();
        if (questionThreeGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question four group is checked
        RadioGroup questionFourOptions = (RadioGroup) findViewById(R.id.questionFourRadioGroup);
        boolean questionFourGroups = questionFourOptions.isEnabled();
        if (questionFourGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question five group is checked
        RadioGroup questionFiveOptions = (RadioGroup) findViewById(R.id.questionFiveRadioGroup);
        boolean questionFiveGroups = questionFiveOptions.isEnabled();
        if (questionFiveGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question six group is checked
        RadioGroup questionSixOptions = (RadioGroup) findViewById(R.id.questionSixRadioGroup);
        boolean questionSixGroups = questionSixOptions.isEnabled();
        if (questionSixGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question seven group is checked
        RadioGroup questionSevenOptions = (RadioGroup) findViewById(R.id.questionSevenRadioGroup);
        boolean questionSevenGroups = questionSevenOptions.isEnabled();
        if (questionSevenGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question eight group is checked
        RadioGroup questionEightOptions = (RadioGroup) findViewById(R.id.questionEightRadioGroup);
        boolean questionEightGroups = questionEightOptions.isEnabled();
        if (questionEightGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question nine group is checked
        RadioGroup questionNineOptions = (RadioGroup) findViewById(R.id.questionNineRadioGroup);
        boolean questionNineGroups = questionNineOptions.isEnabled();
        if (questionNineGroups) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question ten group is checked
        RadioGroup questionTenOptions = (RadioGroup) findViewById(R.id.questionTenRadioGroup);
        boolean questionTenGroups = questionTenOptions.isEnabled();
        if (questionTenGroups) {
            totalAttemptedQuestions += 1;
        }

        // Displays the no of attempted questions on a TextView

        TextView questionsAttempt = (TextView) findViewById(R.id.question_attempted_text_view);
        questionsAttempt.setText("" + totalAttemptedQuestions);

        /**
         * this section checks for the number of correct answers selected
         */


        //Check if the correct answer was selected for question one
        RadioButton questionOneCorrectAnswer = (RadioButton) findViewById(R.id.question1option2Correct);
        boolean questionOneCorrectOption = questionOneCorrectAnswer.isChecked();
        if (questionOneCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question two
        RadioButton questionTwoCorrectAnswer = (RadioButton) findViewById(R.id.question2option1Correct);
        boolean questionTwoCorrectOption = questionTwoCorrectAnswer.isChecked();
        if (questionTwoCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question three
        RadioButton questionThreeCorrectAnswer = (RadioButton) findViewById(R.id.question3option4Correct);
        boolean questionThreeCorrectOption = questionThreeCorrectAnswer.isChecked();
        if (questionThreeCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question four
        RadioButton questionFourCorrectAnswer = (RadioButton) findViewById(R.id.question4option2Correct);
        boolean questionFourCorrectOption = questionFourCorrectAnswer.isChecked();
        if (questionFourCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question five
        RadioButton questionFiveCorrectAnswer = (RadioButton) findViewById(R.id.question5option1Correct);
        boolean questionFiveCorrectOption = questionFiveCorrectAnswer.isChecked();
        if (questionFiveCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question six
        RadioButton questionSixCorrectAnswer = (RadioButton) findViewById(R.id.question6option3Correct);
        boolean questionSixCorrectOption = questionSixCorrectAnswer.isChecked();
        if (questionSixCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question seven
        RadioButton questionSevenCorrectAnswer = (RadioButton) findViewById(R.id.question7option2Correct);
        boolean questionSevenCorrectOption = questionSevenCorrectAnswer.isChecked();
        if (questionSevenCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question eight
        RadioButton questionEightCorrectAnswer = (RadioButton) findViewById(R.id.question8option4Correct);
        boolean questionEightCorrectOption = questionEightCorrectAnswer.isChecked();
        if (questionEightCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question nine
        RadioButton questionNineCorrectAnswer = (RadioButton) findViewById(R.id.question9option3Correct);
        boolean questionNineCorrectOption = questionNineCorrectAnswer.isChecked();
        if (questionNineCorrectOption) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question ten
        RadioButton questionTenCorrectAnswer = (RadioButton) findViewById(R.id.question10option3Correct);
        boolean questionTenCorrectOption = questionTenCorrectAnswer.isChecked();
        if (questionTenCorrectOption) {
            totalCorrectAnswers += 1;
        }


        //this section displays number of the correct answers in a text view


        TextView correctScores = (TextView) findViewById(R.id.quiz_score_text_view);
        correctScores.setText("" + totalCorrectAnswers);


        /**
         * this section summarises the quiz report and displays it as a toast
         */


        //gets player name
        EditText playerNameTextView = (EditText) findViewById(R.id.player_name);
        Editable playerName = playerNameTextView.getText();
        //calculate percentage score
        int percentageScore = ((totalCorrectAnswers / totalQuestions) * 100);
        //create summary message
        String summary = "Player Name = " + playerName;
        summary = summary + "\nAttempts = " + totalAttemptedQuestions + "of" + totalQuestions;
        summary = summary + "\nCorrect Answers = " + totalCorrectAnswers;
        summary = summary + "\nPercentage = " + percentageScore + "%";

        Toast.makeText(this, summary, Toast.LENGTH_LONG).show();


    }

}
