package com.wang.design.chapter16;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author tracy
 *
 * 16-状态模式
 */
public class Switcher {
    private Light light;

    public void lightSwitch(){
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                if(Light.counter<60){
                    light=new Red();
                    light.on();
                    Light.counter+=5;
                }else if(Light.counter<70){
                    light=new Yellow();
                    light.on();
                    Light.counter+=5;
                }else{
                    light=new Green();
                    light.on();
                    Light.counter+=5;
                    if(Light.counter==100) Light.counter=0;
                }
            }
        };
        //设置定时任务，延迟0s，每过5s执行一次
        new Timer().schedule(timerTask,0,5000);
    }
}
