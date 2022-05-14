package com.wang.design.chapter3;

/**
 * @author tracy
 * 3——工厂模式——工厂类
 */
public interface Factory {
    Passenger create(int x,int y);
}

class PassengerFactory implements Factory{
    @Override
    public Passenger create(int x,int y) {
        return new Passenger(x,y);
    }
}
