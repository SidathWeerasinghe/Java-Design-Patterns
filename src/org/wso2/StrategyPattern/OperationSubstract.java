package org.wso2.StrategyPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}