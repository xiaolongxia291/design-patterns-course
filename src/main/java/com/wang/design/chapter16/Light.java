package com.wang.design.chapter16;

/**
 * @author tracy
 *
 * 16-状态模式
 */
public abstract class Light {
    protected static int counter=0;//用来读秒
    protected abstract void on();
}

class Red extends Light{
    @Override
    public void on() {
        System.out.println(counter+"s 红灯...");
    }
}

class Yellow extends Light{
    @Override
    public void on() {
        System.out.println(counter+"s 黄灯...");
    }
}

class Green extends Light{
    @Override
    public void on() {
        System.out.println(counter+"s 绿灯...");
    }
}
