package org.wso2.FacadePattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Samsung galaxy tab 3 ");
    }
    @Override
    public void price() {
        System.out.println(" Rs 45000.00 ");
    }
}