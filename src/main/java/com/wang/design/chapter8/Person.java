package com.wang.design.chapter8;

/**
 * @author tracy
 * 8-适配器模式
 */
public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void talk(Person anothor){
        System.out.println(this.name+"(人)正在与"+anothor.getName()+"(人)交流...");
    }
}
