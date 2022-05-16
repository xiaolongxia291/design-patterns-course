package com.wang.design.chapter7;

/**
 * @author tracy
 * 7-装饰模式
 *
 */
public class Client {
    public static void main(String[] args) {
        Showable gift=new BowknotDecorator(new BoxDecorator(new Gift()));
        gift.show();
    }
}
