package com.wang.design.chapter3;

import java.util.Random;

/**
 * @author tracy
 * 3——工厂模式
 */
public class Passenger {
    private int x,y;
    private int gender;//0表示女性 1表示男性

    public Passenger(int x,int y){
        this.x=x;
        this.y=y;
        this.gender=new Random().nextInt(2);
    }

    public void show(){
        System.out.println("乘客 坐标["+x+","+y+"]");
    }
}
