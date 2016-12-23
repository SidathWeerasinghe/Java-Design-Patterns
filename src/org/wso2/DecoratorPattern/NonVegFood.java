package org.wso2.DecoratorPattern;

/**
 * Created by wso2 on 7/15/16.
 */
public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+150.0;
    }
}