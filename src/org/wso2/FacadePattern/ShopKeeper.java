package org.wso2.FacadePattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
   private MobileShop blackberry;

    public ShopKeeper(){
        iphone= new Iphone();
        samsung=new Samsung();
        blackberry=new Blackberry();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void blackberrySale(){
        blackberry.modelNo();
        blackberry.price();
    }
}