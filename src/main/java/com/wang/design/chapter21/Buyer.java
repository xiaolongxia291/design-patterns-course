package com.wang.design.chapter21;

import java.util.List;

/**
 * @author tracy
 * 21-观察者模式
 */
public abstract class Buyer {
    protected String name;

    public Buyer(String name) {
        this.name = name;
    }

    //来自商家的到货通知
    public abstract void inform(Shop shop);
}

class HandicraftBuyer extends Buyer{
    public HandicraftBuyer(String name) {
        super(name);
    }

    @Override
    public void inform(Shop shop) {
        List<String> products=shop.getHandicraft();
        if(products.size()!=0){
            System.out.println("====="+this.name+"买入手工艺品=====");
            for (String str:products){
                System.out.println(str);
            }
            products.clear();
        }
    }
}

class StatonaryBuyer extends Buyer{
    public StatonaryBuyer(String name) {
        super(name);
    }

    @Override
    public void inform(Shop shop) {
        List<String> products=shop.getStationary();
        if(products.size()!=0){
            System.out.println("====="+this.name+"买入文具=====");
            for (String str:products){
                System.out.println(str);
            }
            products.clear();
        }
    }
}

class PhoneBuyer extends Buyer{
    public PhoneBuyer(String name) {
        super(name);
    }

    @Override
    public void inform(Shop shop) {
        List<String> products=shop.getPhone();
        if(products.size()!=0){
            System.out.println("====="+this.name+"买入手机=====");
            for (String str:products){
                System.out.println(str);
            }
            products.clear();
        }
    }
}