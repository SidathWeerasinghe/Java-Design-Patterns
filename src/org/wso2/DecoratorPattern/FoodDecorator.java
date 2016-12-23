package org.wso2.DecoratorPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public abstract class FoodDecorator implements Food{
    private Food newFood;
    public FoodDecorator(Food newFood)  {
        this.newFood=newFood;
    }
    @Override
   public String prepareFood(){
        return newFood.prepareFood();
    }
    public double foodPrice(){
        return newFood.foodPrice();
    }
}