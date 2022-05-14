package com.wang.design.chapter5;

/**
 * @author tracy
 *
 * 5-门面模式
 */
public class Client2 {
    public static void main(String[] args) {
        System.out.println("=====开始一门课程=====");
        new Facade().course();
        System.out.println("=====结束一门课程=====");
    }
}
