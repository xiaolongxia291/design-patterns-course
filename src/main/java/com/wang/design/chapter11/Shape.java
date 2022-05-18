package com.wang.design.chapter11;

/**
 * @author tracy
 *
 * 11-桥接模式
 */
public interface Shape {
    void shape();
}

class Tri implements Shape{
    @Override
    public void shape() {
        System.out.print("△");
    }
}

class Rect implements Shape{
    @Override
    public void shape() {
        System.out.print("□");
    }
}

class Round implements Shape{
    @Override
    public void shape() {
        System.out.print("○");
    }
}
