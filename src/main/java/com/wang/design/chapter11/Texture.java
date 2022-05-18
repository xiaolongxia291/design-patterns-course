package com.wang.design.chapter11;

/**
 * @author tracy
 *
 * 11-桥接模式
 */
public interface Texture {
    void showTexture();
}

class Water implements Texture{
    @Override
    public void showTexture() {
        System.out.print("[水彩]");
    }
}

class Sketch implements Texture{
    @Override
    public void showTexture() {
        System.out.print("[素描]");
    }
}

class Oil implements Texture{
    @Override
    public void showTexture() {
        System.out.print("[油画]");
    }
}

