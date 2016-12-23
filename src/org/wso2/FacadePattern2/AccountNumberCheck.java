package org.wso2.FacadePattern2;

/**
 * Created by wso2 on 7/15/16.
 */
public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActivate (int acctNumberToCheck) {

        if(acctNumberToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }
    }

}

