package org.wso2.FacadePattern2;

/**
 * Created by wso2 on 7/15/16.
 */
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(12345674, 1234);

        accessingBank.withdrawCash(500.00);

        //accessingBank.withdrawCash(99.00);

        accessingBank.depositCash(100);
    }
}
