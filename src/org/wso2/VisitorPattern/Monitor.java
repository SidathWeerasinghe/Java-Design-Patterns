package org.wso2.VisitorPattern;

/**
 * Created by wso2 on 7/17/16.
 */


public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}