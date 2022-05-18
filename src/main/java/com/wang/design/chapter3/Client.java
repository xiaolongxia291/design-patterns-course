package com.wang.design.chapter3;

/**
 * 3-工厂模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("begin");

        Factory factory=new PassengerFactory();
        for(int i=0;i<10;++i){
            factory.create(0,0).show();
        }

        System.out.println("end");
    }
}
