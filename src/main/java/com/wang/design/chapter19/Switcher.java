package com.wang.design.chapter19;

/**
 * @author tracy
 *
 * 19-命令模式
 */
public class Switcher {
    private AirCommand airCommand;

    public Switcher(AirCommand airCommand) {
        this.airCommand = airCommand;
    }

    public void buttonPush(){
        System.out.println("按下开关");
        this.airCommand.onExecute();
        System.out.println();
    }

    public void buttonPop(){
        System.out.println("放下开关");
        this.airCommand.offExecute();
        System.out.println();
    }
}
