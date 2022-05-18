package com.wang.design.chapter11;

/**
 * @author tracy
 *
 * 11-桥接模式
 */
public interface Color {
    void showColor();
}

class Red implements Color{
    @Override
    public void showColor() {
        System.out.print("[红]");
    }
}

class Green implements Color{
    @Override
    public void showColor() {
        System.out.print("[绿]");
    }
}

class Purple implements Color{
    @Override
    public void showColor() {
        System.out.print("[紫]");
    }
}

