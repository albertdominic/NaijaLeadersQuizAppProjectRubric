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
         * This Section Makes Sure that the Value of Attempted Questions and Correct Answers are Set to default before any other changes
         * This will prevent them from doubling each time the submit quiz button is clicked
         */
        totalCorrectAnswers -= totalCorrectAnswers;
        totalAttemptedQuestions -= totalAttemptedQuestions;

        /**
         * This Section Counts the radio buttons checked and displays the number on a TextView
         */


        //Check if any radio button in the question one radio group is checked

        //gets the checked state of option one in question one and then store the check state in a variable
        RadioButton optionOneForQuestionOne = (RadioButton) findViewById(R.id.question1option1);
        boolean optionOneQuestionOne = optionOneForQuestionOne.isChecked();

        //gets the checked state of option two in question one and then store the check state in a variable
        RadioButton optionTwoForQuestionOne = (RadioButton) findViewById(R.id.question1option2Correct);
        boolean optionTwoQuestionOne = optionTwoForQuestionOne.isChecked();

        //gets the checked state of option three in question one and then store the check state in a variable
        RadioButton optionThreeForQuestionOne = (RadioButton) findViewById(R.id.question1option3);
        boolean optionThreeQuestionOne = optionThreeForQuestionOne.isChecked();

        //gets the checked state of option four in question one and then store the check state in a variable
        RadioButton optionFourForQuestionOne = (RadioButton) findViewById(R.id.question1option3);
        boolean optionFourQuestionOne = optionFourForQuestionOne.isChecked();

        //this section increases the TotalAttemptedQuestions by one if any of the radio button in question one is checked
        if (optionOneQuestionOne || optionTwoQuestionOne || optionThreeQuestionOne || optionFourQuestionOne) {
            totalAttemptedQuestions += 1;
        }



        //Check if any radio buttons in the question two radio group is checked

        //gets the checked state of option one in question two and then store the check state in a variable
        RadioButton optionOneForQuestionTwo = (RadioButton) findViewById(R.id.question2option1Correct);
        boolean optionOneQuestionTwo = optionOneForQuestionTwo.isChecked();

        //gets the checked state of option two in question two and then store the check state in a variable
        RadioButton optionTwoForQuestionTwo = (RadioButton) findViewById(R.id.question2option2);
        boolean optionTwoQuestionTwo = optionTwoForQuestionTwo.isChecked();

        //gets the checked state of option three in question two and then store the check state in a variable
        RadioButton optionThreeForQuestionTwo = (RadioButton) findViewById(R.id.question2option3);
        boolean optionThreeQuestionTwo = optionThreeForQuestionTwo.isChecked();

        //gets the checked state of option four in question two and then store the check state in a variable
        RadioButton optionFourForQuestionTwo = (RadioButton) findViewById(R.id.question2option4);
        boolean optionFourQuestionTwo = optionFourForQuestionTwo.isChecked();

        //this section increases the totalAttemptedQuestions by one if any of the radio button in question two is checked
        if (optionOneQuestionTwo || optionTwoQuestionTwo || optionThreeQuestionTwo || optionFourQuestionTwo) {
            totalAttemptedQuestions += 1;
        }


        //Check if any radio button in the question three radio group is checked

        //gets the checked state of option one in question three and then store the check state in a variable
        RadioButton optionOneForQuestionThree = (RadioButton) findViewById(R.id.question3option1);
        boolean optionOneQuestionThree = optionOneForQuestionThree.isChecked();

        //gets the checked state of option two in question three and then store the check state in a variable
        RadioButton optionTwoForQuestionThree = (RadioButton) findViewById(R.id.question3option2);
        boolean optionTwoQuestionThree = optionTwoForQuestionThree.isChecked();

        //gets the checked state of option three in question three and then store the check state in a variable
        RadioButton optionThreeForQuestionThree = (RadioButton) findViewById(R.id.question3option3);
        boolean optionThreeQuestionThree = optionThreeForQuestionThree.isChecked();

        //gets the checked state of option four in question three and then store the check state in a variable
        RadioButton optionFourForQuestionThree = (RadioButton) findViewById(R.id.question3option4Correct);
        boolean optionFourQuestionThree = optionFourForQuestionThree.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question three is checked
        if (optionOneQuestionThree || optionTwoQuestionThree || optionThreeQuestionThree || optionFourQuestionThree) {
            totalAttemptedQuestions += 1;
        }


        //Check if any radio button in the question four radio group is checked

        //gets the checked state of option one in question four and then store the check state in a variable
        RadioButton optionOneForQuestionFour = (RadioButton) findViewById(R.id.question4option1);
        boolean optionOneQuestionFour = optionOneForQuestionFour.isChecked();

        //gets the checked state of option two in question four and then store the check state in a variable
        RadioButton optionTwoForQuestionFour = (RadioButton) findViewById(R.id.question4option2Correct);
        boolean optionTwoQuestionFour = optionTwoForQuestionFour.isChecked();

        //gets the checked state of option three in question four and then store the check state in a variable
        RadioButton optionThreeForQuestionFour = (RadioButton) findViewById(R.id.question4option3);
        boolean optionThreeQuestionFour = optionThreeForQuestionFour.isChecked();

        //gets the checked state of option four in question four and then store the check state in a variable
        RadioButton optionFourForQuestionFour = (RadioButton) findViewById(R.id.question4option4);
        boolean optionFourQuestionFour = optionFourForQuestionFour.isChecked();

        //this section increases the TotalAttemptedQuestions by one if any of the radio button in question four is checked
        if (optionOneQuestionFour || optionTwoQuestionFour || optionThreeQuestionFour || optionFourQuestionFour) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question five radio group is checked

        //gets the checked state of option one in question five and then store the check state in a variable
        RadioButton optionOneForQuestionFive = (RadioButton) findViewById(R.id.question5option1Correct);
        boolean optionOneQuestionFive = optionOneForQuestionFive.isChecked();

        //gets the checked state of option two in question five and then store the check state in a variable
        RadioButton optionTwoForQuestionFive = (RadioButton) findViewById(R.id.question5option2);
        boolean optionTwoQuestionFive = optionTwoForQuestionFive.isChecked();

        //gets the checked state of option three in question five and then store the check state in a variable
        RadioButton optionThreeForQuestionFive = (RadioButton) findViewById(R.id.question5option3);
        boolean optionThreeQuestionFive = optionThreeForQuestionFive.isChecked();

        //gets the checked state of option four in question five and then store the check state in a variable
        RadioButton optionFourForQuestionFive = (RadioButton) findViewById(R.id.question5option4);
        boolean optionFourQuestionFive = optionFourForQuestionFive.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question five is checked
        if (optionOneQuestionFive || optionTwoQuestionFive || optionThreeQuestionFive || optionFourQuestionFive) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question six group is checked

        //gets the checked state of option one in question six and then store the check state in a variable
        RadioButton optionOneForQuestionSix = (RadioButton) findViewById(R.id.question6option1);
        boolean optionOneQuestionSix = optionOneForQuestionSix.isChecked();

        //gets the checked state of option two in question six and then store the check state in a variable
        RadioButton optionTwoForQuestionSix = (RadioButton) findViewById(R.id.question6option2);
        boolean optionTwoQuestionSix = optionTwoForQuestionSix.isChecked();

        //gets the checked state of option three in question six and then store the check state in a variable
        RadioButton optionThreeForQuestionSix = (RadioButton) findViewById(R.id.question6option3Correct);
        boolean optionThreeQuestionSix = optionThreeForQuestionSix.isChecked();

        //gets the checked state of option four in question six and then store the check state in a variable
        RadioButton optionFourForQuestionSix = (RadioButton) findViewById(R.id.question6option4);
        boolean optionFourQuestionSix = optionFourForQuestionSix.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question six is checked
        if (optionOneQuestionSix || optionTwoQuestionSix || optionThreeQuestionSix || optionFourQuestionSix) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question seven group is checked

        //gets the checked state of option one in question seven and then store the check state in a variable
        RadioButton optionOneForQuestionSeven = (RadioButton) findViewById(R.id.question7option1);
        boolean optionOneQuestionSeven = optionOneForQuestionSeven.isChecked();

        //gets the checked state of option two in question seven and then store the check state in a variable
        RadioButton optionTwoForQuestionSeven = (RadioButton) findViewById(R.id.question7option2Correct);
        boolean optionTwoQuestionSeven = optionTwoForQuestionSeven.isChecked();

        //gets the checked state of option three in question seven and then store the check state in a variable
        RadioButton optionThreeForQuestionSeven = (RadioButton) findViewById(R.id.question7option3);
        boolean optionThreeQuestionSeven = optionThreeForQuestionSeven.isChecked();

        //gets the checked state of option four in question seven and then store the check state in a variable
        RadioButton optionFourForQuestionSeven = (RadioButton) findViewById(R.id.question7option4);
        boolean optionFourQuestionSeven = optionFourForQuestionSeven.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question seven is checked
        if (optionOneQuestionSeven || optionTwoQuestionSeven || optionThreeQuestionSeven || optionFourQuestionSeven) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question eight group is checked

        //gets the checked state of option one in question eight and then store the check state in a variable
        RadioButton optionOneForQuestionEight = (RadioButton) findViewById(R.id.question8option1);
        boolean optionOneQuestionEight = optionOneForQuestionEight.isChecked();

        //gets the checked state of option two in question eight and then store the check state in a variable
        RadioButton optionTwoForQuestionEight = (RadioButton) findViewById(R.id.question8option2);
        boolean optionTwoQuestionEight = optionTwoForQuestionEight.isChecked();

        //gets the checked state of option three in question eight and then store the check state in a variable
        RadioButton optionThreeForQuestionEight = (RadioButton) findViewById(R.id.question8option3);
        boolean optionThreeQuestionEight = optionThreeForQuestionEight.isChecked();

        //gets the checked state of option four in question eight and then store the check state in a variable
        RadioButton optionFourForQuestionEight = (RadioButton) findViewById(R.id.question8option4Correct);
        boolean optionFourQuestionEight = optionFourForQuestionEight.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question eight is checked
        if (optionOneQuestionEight || optionTwoQuestionEight || optionThreeQuestionEight || optionFourQuestionEight) {
            totalAttemptedQuestions += 1;
        }

        //Check if any radio button in the question nine group is checked

        //gets the checked state of option one in question nine and then store the check state in a variable
        RadioButton optionOneForQuestionNine = (RadioButton) findViewById(R.id.question9option1);
        boolean optionOneQuestionNine = optionOneForQuestionNine.isChecked();

        //gets the checked state of option two in question nine and then store the check state in a variable
        RadioButton optionTwoForQuestionNine = (RadioButton) findViewById(R.id.question9option2);
        boolean optionTwoQuestionNine = optionTwoForQuestionNine.isChecked();

        //gets the checked state of option three in question nine and then store the check state in a variable
        RadioButton optionThreeForQuestionNine = (RadioButton) findViewById(R.id.question9option3Correct);
        boolean optionThreeQuestionNine = optionThreeForQuestionNine.isChecked();

        //gets the checked state of option four in question nine and then store the check state in a variable
        RadioButton optionFourForQuestionNine = (RadioButton) findViewById(R.id.question9option4);
        boolean optionFourQuestionNine = optionFourForQuestionNine.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question nine is checked
        if (optionOneQuestionNine || optionTwoQuestionNine || optionThreeQuestionNine || optionFourQuestionNine) {
            totalAttemptedQuestions += 1;
        }


        //Check if any radio button in the question ten group is checked

        //gets the checked state of option one in question ten and then store the check state in a variable
        RadioButton optionOneForQuestionTen = (RadioButton) findViewById(R.id.question10option1);
        boolean optionOneQuestionTen = optionOneForQuestionTen.isChecked();

        //gets the checked state of option two in question ten and then store the check state in a variable
        RadioButton optionTwoForQuestionTen = (RadioButton) findViewById(R.id.question10option2);
        boolean optionTwoQuestionTen = optionTwoForQuestionTen.isChecked();

        //gets the checked state of option three in question ten and then store the check state in a variable
        RadioButton optionThreeForQuestionTen = (RadioButton) findViewById(R.id.question10option3Correct);
        boolean optionThreeQuestionTen = optionThreeForQuestionTen.isChecked();

        //gets the checked state of option four in question ten and then store the check state in a variable
        RadioButton optionFourForQuestionTen = (RadioButton) findViewById(R.id.question10option4);
        boolean optionFourQuestionTen = optionFourForQuestionTen.isChecked();

        //this section increases the totalAttemptedQuestion by one if any of the radio button in question ten is checked
        if (optionOneQuestionTen || optionTwoQuestionTen || optionThreeQuestionTen || optionFourQuestionTen) {
            totalAttemptedQuestions += 1;
        }

        // Displays the no of attempted questions on a TextView

        TextView questionsAttempt = (TextView) findViewById(R.id.question_attempted_text_view);
        questionsAttempt.setText("" + totalAttemptedQuestions);

        /**
         * this section checks for the number of correct answers selected
         */


        //Check if the correct answer was selected for question one

        if (optionTwoQuestionOne) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question two

        if (optionOneQuestionTwo) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question three

        if (optionFourQuestionThree) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question four

        if (optionTwoQuestionFour) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question five

        if (optionOneQuestionFive) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question six

        if (optionThreeQuestionSix) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question seven

        if (optionTwoQuestionSeven) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question eight

        if (optionFourQuestionEight) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question nine

        if (optionThreeQuestionNine) {
            totalCorrectAnswers += 1;
        }

        //Check if the correct answer was selected for question ten

        if (optionThreeQuestionTen) {
            totalCorrectAnswers += 1;
        }


        /**
         * this section displays number of the correct answers in a text view
         */

        TextView correctScores = (TextView) findViewById(R.id.quiz_score_text_view);
        correctScores.setText("" + totalCorrectAnswers);


        /**
         * this section summarises the quiz report and displays it as a toast
         */

        //calculate percentage score
        //float fractionalScore = totalCorrectAnswers / totalQuestions;
        //float percentageScore = fractionalScore * 100;


        //gets player name
        EditText playerNameTextView = (EditText) findViewById(R.id.player_name);
        Editable playerName = playerNameTextView.getText();


        //create summary message
        String summary = "Player Name : " + playerName;
        summary = summary + "\nAttempts : " + totalAttemptedQuestions + " of " + totalQuestions;
        summary = summary + "\nCorrect Answers : " + totalCorrectAnswers;
        //summary = summary + "\nPercentage Score : " + percentageScore + "%";

        //displays the summary as a toast
        Toast.makeText(this, summary, Toast.LENGTH_LONG).show();


    }

}

