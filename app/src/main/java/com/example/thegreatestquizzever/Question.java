package com.example.thegreatestquizzever;

public class Question {
    private String question;
    private Boolean questionAnswer;

    public Question(String question, Boolean questionAnswer) {
        this.question = question;
        this.questionAnswer = questionAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public Boolean getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQuestionAnswer(Boolean questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
}