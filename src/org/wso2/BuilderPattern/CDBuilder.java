package org.wso2.BuilderPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cds=new CDType();
        cds.addItem(new Sony());
        return cds;
    }
    public CDType buildSamsungCD(){
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}