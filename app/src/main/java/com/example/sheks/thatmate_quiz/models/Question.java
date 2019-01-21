package com.example.sheks.thatmate_quiz.models;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;


public class Question implements Parcelable
{

    private String Question;

    private Question(Parcel in) {
        Question = in.readString();
        ansno = in.readInt();
        option1 = in.readString();
        option2 = in.readString();
        option3 = in.readString();
        option4 = in.readString();
    }


    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public void setQuestion(String question) {
        Question = question;
    }

  /*  public void setAnsno(int ansno) {
        this.ansno = ansno;
    }*/

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    private int ansno;
    /**
     *
     */
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public Question(String question,  String option1, String option2, String option3, String option4,int ansno) {
        Question = question;
        this.ansno = ansno;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }


    public String getQuestion() {
        return Question;
    }

    public int getAnsno() {
        return ansno;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Question);
        parcel.writeInt(ansno);
        parcel.writeString(option1);
        parcel.writeString(option2);
        parcel.writeString(option3);
        parcel.writeString(option4);
    }
}
