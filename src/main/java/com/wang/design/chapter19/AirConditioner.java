package com.wang.design.chapter19;

/**
 * @author tracy
 *
 * 19-命令模式
 */
public class AirConditioner {
    private String name;
    private boolean on=false;

    public AirConditioner(String name) {
        this.name = name;
    }

    //开
    public void turnOn(){
        System.out.println(this.name+"打开了");
        if(!on)this.on=true;
    }

    //关
    public void turnOff(){
        System.out.println(this.name+"关闭了");
        if(on)this.on=false;
    }
}
