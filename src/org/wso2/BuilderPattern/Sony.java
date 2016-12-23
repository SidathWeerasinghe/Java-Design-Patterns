package org.wso2.BuilderPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class Sony extends Company{
    @Override
    public int price(){
        return 20;
    }
    @Override
    public String pack(){
        return "Sony CD";
    }
}