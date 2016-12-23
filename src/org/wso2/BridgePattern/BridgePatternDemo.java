package org.wso2.BridgePattern;

/**
 * Created by wso2 on 7/14/16.
 */

//This pattern has two separate things. Its Abstraction and Implementation. We can build this by separately.


public class BridgePatternDemo {
    public static void main(String[] args) {

        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q=new JavaQuestions();

        questions.delete("what is class?");
        questions.display();



        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }
}