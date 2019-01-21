package com.example.sheks.thatmate_quiz;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sheks.thatmate_quiz.models.Question;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener
{


    TextView question;
    Button option1;
    Button option2;
    Button option3;
    Button option4;

    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewCountDown;
    private Button buttonConfirmNext;

    private int questionCounter;
    private int questionCountTotal =5;
    private Question currentQuestion;

    private int score;
    private boolean answered;
    private int clicked=0;


    ArrayList <Question> questionList ;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_quiz);

        textViewScore = findViewById(R.id.text_view_score);
        textViewQuestionCount = findViewById(R.id.text_view_question_count);
        textViewCountDown = findViewById(R.id.text_view_countdown);
        buttonConfirmNext = findViewById (R.id.next);
        question = findViewById (R.id.question);
        option1 = findViewById (R.id.option1);
        option2 = findViewById (R.id.option2);
        option3 = findViewById (R.id.option3);
        option4 = findViewById (R.id.option4);

        questionList = this.getIntent().getParcelableArrayListExtra("questions");


        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);

        showNextQuestion();

        buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) {
                    if (IsClicked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(QuizActivity.this, "Please select an answer", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNextQuestion();
                }
            }



            private boolean IsClicked() {

                if (answered)
                    return true;
                else
                    return false;

            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void showNextQuestion() {

        clearCheck();

        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);

            question.setText(currentQuestion.getQuestion());
            option1.setText(currentQuestion.getOption1());
            option2.setText(currentQuestion.getOption2());
            option3.setText(currentQuestion.getOption3());
            option3.setText(currentQuestion.getOption3());

            option1.setOnClickListener (this);
            option2.setOnClickListener (this);
            option3.setOnClickListener (this);
            option4.setOnClickListener (this);


            questionCounter++;
            textViewQuestionCount.setText("Question: " + questionCounter + "/" + questionCountTotal);
            answered = false;
            buttonConfirmNext.setText("Confirm");
        } else {
            finishQuiz();
        }
    }

    private void clearCheck() {
        answered = false;
        option1.setBackground (Drawable.createFromPath ("#06f0d1"));
        option2.setBackground (Drawable.createFromPath ("#06f0d1"));
        option3.setBackground (Drawable.createFromPath ("#06f0d1"));
        option4.setBackground (Drawable.createFromPath ("#06f0d1"));
    }

    private void checkAnswer() {
        answered = true;


        if (clicked == currentQuestion.getAnsno ()) {
            score++;
            textViewScore.setText(getString(R.string.ScoreTextView) + score);
        }

        showSolution();
    }

    private void showSolution() {


        /*option1.setTextColor(Color.RED);
        option2.setTextColor(Color.RED);
        option3.setTextColor(Color.RED);
        option4.setTextColor(Color.RED);

        switch (currentQuestion.getAnsno ()) {
            case 1:
                option1.setTextColor(Color.GREEN);
                question.setText("Answer 1 is correct");
                break;
            case 2:
                option2.setTextColor(Color.GREEN);
                question.setText("Answer 2 is correct");
                break;
            case 3:
                option3.setTextColor(Color.GREEN);
                question.setText("Answer 3 is correct");
                break;
            case 4:
                option4.setTextColor(Color.GREEN);
                question.setText("Answer 4 is correct");
                break;
        }*/

        if (questionCounter < questionCountTotal) {
            buttonConfirmNext.setText(R.string.NextButton);
        } else {
            buttonConfirmNext.setText(R.string.finishButton);
        }
    }

    private void finishQuiz() {
        finish();
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v)
    {
        switch (v.getId ()) {

            case R.id.option1 :
                                if(currentQuestion.getAnsno () == 1)
                                    option1.setBackground (Drawable.createFromPath ("#06f0d1"));
                                else
                                    option1.setBackground (Drawable.createFromPath ("#e70000"));
                                answered = true;
                                clicked =1;
                                break;

            case R.id.option2 :
                                 if(currentQuestion.getAnsno () == 1)
                                    option1.setBackground (Drawable.createFromPath ("#06f0d1"));
                                 else
                                    option1.setBackground (Drawable.createFromPath ("#e70000"));
                                  answered = true;
                                  clicked = 2;
                                  break;

            case R.id.option3 :
                                if(currentQuestion.getAnsno () == 1)
                                    option1.setBackground (Drawable.createFromPath ("#06f0d1"));
                                else
                                    option1.setBackground (Drawable.createFromPath ("#e70000"));
                                answered = true;
                                clicked = 3;
                                break;

            case R.id.option4 :
                               if(currentQuestion.getAnsno () == 1)
                                    option1.setBackground (Drawable.createFromPath ("#06f0d1"));
                                else
                                    option1.setBackground (Drawable.createFromPath ("#e70000"));
                                answered = true;

                                clicked =4 ;
                                 break;
        }
    }
}


