package com.example.simplesurveycreator.model;

import com.example.simplesurveycreator.utils.QuestionTypes;

import java.util.List;

public class Questions {
    private String questionName;
    private List<Options> options ;
    private QuestionTypes type;

    public Questions(String questionName, List<Options> _options, QuestionTypes _type) {
        this.questionName = questionName;
        this.options = _options;
        this.type = _type;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public QuestionTypes getType() {
        return type;
    }

    public void setType(QuestionTypes type) {
        this.type = type;
    }
}
