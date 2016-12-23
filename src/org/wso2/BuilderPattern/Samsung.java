package org.wso2.BuilderPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class Samsung extends Company {
    @Override
    public int price(){
        return 15;
    }
    @Override
    public String pack(){
        return "Samsung CD";
    }
}