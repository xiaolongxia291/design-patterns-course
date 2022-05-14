package com.wang.design.chapter4;

/**
 * @author tracy
 * 4-建造者模式-实际施工
 */
public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        //监理别墅施工队
        director.setBuilder(new HouseBuilder());
        System.out.println(director.direct());
        //监理公寓施工队
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
