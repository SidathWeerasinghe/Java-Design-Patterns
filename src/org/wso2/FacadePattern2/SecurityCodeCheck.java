package org.wso2.FacadePattern2;

/**
 * Created by wso2 on 7/15/16.
 */
public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }


}
