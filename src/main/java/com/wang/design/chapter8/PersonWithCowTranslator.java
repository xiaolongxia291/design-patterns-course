package com.wang.design.chapter8;

/**
 * @author tracy
 * 8-适配器模式
 */
public class PersonWithCowTranslator extends Person{

    public PersonWithCowTranslator(String name){
        super(name);
    }

    public void talkWithCow(Cow cow){
        System.out.println(this.getName()+"(人)正在与"+cow.getName()+"(牛)交流...");
    }
}
