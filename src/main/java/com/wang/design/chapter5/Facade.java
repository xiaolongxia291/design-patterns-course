package com.wang.design.chapter5;

/**
 * @author tracy
 * 5-门面模式
 */
public class Facade {
    public void course(){
        new Check().handle();//考勤
        new Question().handle();//提问
        new Task().handle();//作业
        new Exam().handle();//考试
    }
}
