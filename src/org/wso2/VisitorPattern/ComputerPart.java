package org.wso2.VisitorPattern;

/**
 * Created by wso2 on 7/17/16.
 */

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}