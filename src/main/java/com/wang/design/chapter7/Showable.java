package com.wang.design.chapter7;

/**
 * @author tracy
 * 7-装饰模式
 *
 */
public interface Showable {
    void show();//展示礼物的方法
}

class Gift implements Showable{
    @Override
    public void show() {
        System.out.print("礼物");
    }
}
