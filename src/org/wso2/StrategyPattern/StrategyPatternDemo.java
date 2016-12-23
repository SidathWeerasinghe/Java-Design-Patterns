package org.wso2.StrategyPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context;

        context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}