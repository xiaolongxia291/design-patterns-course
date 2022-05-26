package com.wang.design.chapter19;

/**
 * @author tracy
 *
 * 19-命令模式
 */
public class Client {
    public static void main(String[] args) {
        AirCommand airCommand=new AirCommand(new AirConditioner("美的空调"));
        Switcher switcher=new Switcher(airCommand);
        switcher.buttonPush();
        switcher.buttonPop();
    }
}
