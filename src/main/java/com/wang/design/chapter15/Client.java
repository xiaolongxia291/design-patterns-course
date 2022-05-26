package com.wang.design.chapter15;

/**
 * @author tracy
 *
 * 15-策略模式
 */
public class Client {
    public static void main(String[] args) {
        Glass glass=new Glass();

        glass.setDrinks(new Milk("纯牛奶"));
        glass.drinking();

        glass.setDrinks(new Tea("乌龙茶"));
        glass.drinking();
    }
}
