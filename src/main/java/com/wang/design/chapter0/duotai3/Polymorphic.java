package com.wang.design.chapter0.duotai3;

import com.wang.design.chapter0.jicheng2.Airplane;
import com.wang.design.chapter0.jicheng2.Bus;
import com.wang.design.chapter0.jicheng2.Vehicle;

/**
 * @author Tracy
 *
 * 0-3 多态
 */
public class Polymorphic {
    public static void main(String[] args) {
        /*
         * [交通工具]是[交通工具]
         */
        Vehicle vehicle = new Vehicle() {
            @Override
            public void show() {
                System.out.println("交通工具");
            }
        };
        vehicle.show();
        /*
         * [飞机]是[交通工具]
         */
        vehicle = new Airplane("大型","250t","12345");
        vehicle.show();
        /*
         * [公交车]是[交通工具]
         */
        vehicle = new Bus("中型","2t","220");
        vehicle.show();

        /*
         * 以下为错误用法
         * [交通工具]是[公交车] 错误
         */
        //Bus bus=new Vehicle();
    }
}
