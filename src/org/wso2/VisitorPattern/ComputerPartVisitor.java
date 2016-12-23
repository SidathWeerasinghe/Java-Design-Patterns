package org.wso2.VisitorPattern;

/**
 * Created by wso2 on 7/17/16.
 */


public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}