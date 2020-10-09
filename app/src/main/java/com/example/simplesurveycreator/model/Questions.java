package com.example.simplesurveycreator.model;

public class Questions {
    private String questionName;

    public Questions(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }
}
