package org.wso2.VisitorPattern;

/**
 * Created by wso2 on 7/17/16.
 *
 */


public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}