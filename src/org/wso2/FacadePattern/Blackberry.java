package org.wso2.FacadePattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class Blackberry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Blackberry Z10 ");
    }
    @Override
    public void price() {
        System.out.println(" Rs 55000.00 ");
    }
}