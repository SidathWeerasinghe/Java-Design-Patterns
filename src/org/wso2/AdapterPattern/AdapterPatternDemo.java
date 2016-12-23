package org.wso2.AdapterPattern;

/**
 * Created by wso2 on 7/14/16.
 */
public class AdapterPatternDemo {
    public static void main(String args[]){

        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();

        System.out.print(targetInterface.getCreditCard());
    }
}