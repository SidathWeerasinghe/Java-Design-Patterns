package org.wso2.BridgePattern;

/**
 * Created by wso2 on 7/14/16.
 */

public class QuestionFormat extends QuestionManager {
    public QuestionFormat(String catalog){
        super(catalog);
    }
    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }
}