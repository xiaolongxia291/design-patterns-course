package com.wang.design.chapter12;

import java.util.Iterator;

/**
 * @author tracy
 *
 * 12-迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        DriverRecorder recorder=new DriverRecorder();

        //插入13条视频
        for(int i=0;i<13;++i){
            recorder.append("--视频"+i+"--");
        }

        //遍历recorder中记录的视频
        Iterator<String> it= recorder.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
