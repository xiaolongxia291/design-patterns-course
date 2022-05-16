package com.wang.design.chapter8;

/**
 * @author tracy
 * 8-适配器模式
 */
public class Cow {
    private String name;

    public Cow(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void talk(Cow anothor){
        System.out.println(this.name+"(牛)正在与"+anothor.getName()+"(牛)交流...");
    }
}
