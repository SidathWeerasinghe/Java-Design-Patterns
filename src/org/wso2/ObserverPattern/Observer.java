package org.wso2.ObserverPattern;

/**
 * Created by wso2 on 7/17/16.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}