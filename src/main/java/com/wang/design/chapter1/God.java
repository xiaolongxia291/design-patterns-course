package com.wang.design.chapter1;

/**
 * @author Tracy
 *
 * 1-1 创建型——单例模式——饿汉模式
 */
//public class God {
//    private static final God god=new God();
//
//    private God(){}
//
//    private static God getInstance(){
//        return god;
//    }
//}

import sun.security.provider.Sun;

/**
 * @author Tracy
 *
 * 1-1 创建型——单例模式——懒汉模式
 */
public class God {
    private volatile static God god;

    private God(){}

    private static God getInstance(){
        if(god==null){
            synchronized(Sun.class){
                if(god==null)god=new God();
            }
        }
        return god;
    }
}