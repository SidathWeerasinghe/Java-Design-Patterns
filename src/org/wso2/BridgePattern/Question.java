package org.wso2.BridgePattern;

/**
 * Created by wso2 on 7/14/16.
 */
public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String q);
    public void deleteQuestion(String q);
    public void displayQuestion();
    public void displayAllQuestions();
}