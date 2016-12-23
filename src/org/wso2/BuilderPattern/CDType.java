package org.wso2.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wso2 on 7/15/16.
 */
public class CDType {
    private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs) {
        items.add(packs);
    }
    public void getCost(){
        for (Packing packs : items) {
            packs.price();
        }
    }
    public void showItems(){
        for (Packing packing : items){
            System.out.print("CD name : "+packing.pack());
            System.out.println(", Price : "+packing.price());
        }
    }
}