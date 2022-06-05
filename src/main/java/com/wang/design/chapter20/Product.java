package com.wang.design.chapter20;

import java.time.LocalDate;

/**
 * @author tracy
 * 20-访问者模式
 */

// 商品实体类继承体系
public abstract class Product{
    private String name;//商品名称
    private LocalDate productedDate;//生产日期，后面打折会用到
    private float price;//单价

    public Product(String name, LocalDate productedDate, float price) {
        this.name = name;
        this.productedDate = productedDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getProductedDate() {
        return productedDate;
    }

    public float getPrice() {
        return price;
    }
}

//第一种商品：袋装果干
class DriedFruit extends Product implements Acceptable{
    public DriedFruit(String name, LocalDate productedDate, float price) {
        super(name, productedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

//第二种商品：散装水果
class Fruit extends Product implements Acceptable{
    private float weight;//散装商品需要称重，定义一个新的属性

    public float getWeight() {
        return weight;
    }

    public Fruit(String name, LocalDate productedDate, float price,float weight) {
        super(name, productedDate, price);
        this.weight=weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

//第三种商品：瓶装饮料
class Drink extends Product implements Acceptable{
    public Drink(String name, LocalDate productedDate, float price) {
        super(name, productedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}