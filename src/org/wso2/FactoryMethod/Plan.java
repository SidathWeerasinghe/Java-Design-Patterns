package org.wso2.FactoryMethod;

/**
 * Created by wso2 on 7/14/16.
 */

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){

        System.out.println(units*rate);
    }
}