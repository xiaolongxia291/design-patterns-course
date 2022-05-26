package com.wang.design.chapter19;

/**
 * @author tracy
 *
 * 19-命令模式
 */
public class AirCommand {
    private AirConditioner airConditioner;

    public AirCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void onExecute(){
        this.airConditioner.turnOn();
    }

    public void offExecute(){
        this.airConditioner.turnOff();
    }
}
