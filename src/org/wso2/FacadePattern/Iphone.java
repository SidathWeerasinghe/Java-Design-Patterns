package org.wso2.FacadePattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Iphone 6 ");
    }
    @Override
    public void price() {
        System.out.println(" Rs 65000.00 ");
    }
}