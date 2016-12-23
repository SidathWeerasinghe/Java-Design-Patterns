package org.wso2.FactoryMethod;

/**
 * Created by wso2 on 7/14/16.
 */
class  CommercialPlan extends Plan {
    //@override
    public void getRate() {
        rate = 7.50;
    }
}