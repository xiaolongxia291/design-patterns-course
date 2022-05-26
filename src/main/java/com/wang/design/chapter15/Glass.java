package com.wang.design.chapter15;

/**
 * @author tracy
 *
 * 15-策略模式
 */
public class Glass {
    private Drinks drinks;

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public void drinking(){
        System.out.println("玻璃杯中装入了"+drinks.name);
    }
}
