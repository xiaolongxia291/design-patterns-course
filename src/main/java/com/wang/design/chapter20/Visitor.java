package com.wang.design.chapter20;

import java.time.LocalDate;

/**
 * @author tracy
 * 20-访问者模式
 */
public interface Visitor {
    //为每一种商品实现一种计价方式
    void visit(DriedFruit driedFruit);
    void visit(Fruit fruit);
    void visit(Drink drink);
}

//打折计价类的实现
class DiscountVisitor implements Visitor{
    private LocalDate checkDate;//定义一个结账日期
    private float total;//定义一个结账总金额

    public DiscountVisitor(LocalDate checkDate) {
        this.checkDate = checkDate;
        this.total=0f;
        System.out.println("结账日期："+checkDate);
    }

    @Override
    public void visit(DriedFruit driedFruit) {
        System.out.println("=====果干【"+driedFruit.getName()+"】=====");
        float rate=1;//打折率
        long days=checkDate.toEpochDay()-driedFruit.getProductedDate().toEpochDay();
        if(days>180){
            rate=0;
            System.out.println("果干已过期，请勿食用！");
        }else if(days>60){//超过两个月，8折
            rate=0.8f;
        }else{//默认9折
            rate=0.9f;
        }
        float bill=driedFruit.getPrice()*rate;
        System.out.println(driedFruit.getName()+"1件共计"+bill+"元");
        this.total+=bill;
        System.out.println("当前消费总金额"+this.total+"元");
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("=====水果【"+fruit.getName()+"】=====");
        float rate=1;//打折率
        long days=checkDate.toEpochDay()-fruit.getProductedDate().toEpochDay();
        if(days>7){
            rate=0;
            System.out.println("水果已过期，请勿食用！");
        }else if(days>3){//超过3天，5折
            rate=0.5f;
        }else{//默认9折
            rate=0.9f;
        }
        float bill=fruit.getPrice()*rate;
        System.out.println(fruit.getName()+fruit.getWeight()+"斤共计"+bill+"元");
        this.total+=bill;
        System.out.println("当前消费总金额"+this.total+"元");
    }

    @Override
    public void visit(Drink drink) {
        System.out.println("=====饮料【"+drink.getName()+"】=====");
        System.out.println(drink.getName()+"1件共计"+drink.getPrice()+"元");
        this.total+=drink.getPrice();//不打折
        System.out.println("当前消费总金额"+this.total+"元");
    }
}
