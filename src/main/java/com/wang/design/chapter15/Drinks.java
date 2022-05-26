package com.wang.design.chapter15;

/**
 * @author tracy
 *
 * 15-策略模式
 */
public abstract class Drinks {
    protected String name;

    public Drinks(String name){
        this.name=name;
    }
}

class Milk extends Drinks{
    public Milk(String name) {
        super(name);
    }
}

class Tea extends Drinks{
    public Tea(String name) {
        super(name);
    }
}