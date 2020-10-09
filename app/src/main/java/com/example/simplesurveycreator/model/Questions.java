package com.example.simplesurveycreator.model;

import java.util.List;

public class Questions {
    private String questionName;
    private List<Options> options ;

    public Questions(String questionName, List<Options> _options) {
        this.questionName = questionName;
        this.options = _options;
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
}
