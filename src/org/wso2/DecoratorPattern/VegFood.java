package org.wso2.DecoratorPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class VegFood implements Food {
    public String prepareFood(){
        return "Veg Food";
    }

    public double foodPrice(){
        return 50.0;
    }
}