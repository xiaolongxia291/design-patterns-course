package com.wang.design.chapter8;
/**
 * @author tracy
 * 8-适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Person person=new Person("小明");
        Cow cow=new Cow("牛魔王");
        PersonWithCowTranslator translator=new PersonWithCowTranslator("动物语言学大师");

        person.talk(translator);//小明把想对牛魔王说的话告诉给大师
        translator.talkWithCow(cow);//大师把小明想说的话转告给牛魔王，并获得牛魔王对小明的回复
        translator.talk(person);//大师把牛魔王的回复转达给小明
    }
}
