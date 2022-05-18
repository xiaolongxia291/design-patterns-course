package com.wang.design.chapter2;

/**
 * @author Tracy
 *
 * 2-2 创建型——原型模式
 */
public class PasserbyFactory {
    //单例饿汉模式先创建一个Passerby原型
    private static final Passerby passerby=new Passerby(0,0);

    //获取克隆实例
    public static Passerby getInstance(){
        try{
            return passerby.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
