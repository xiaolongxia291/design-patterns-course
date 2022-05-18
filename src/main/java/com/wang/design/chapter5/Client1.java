package com.wang.design.chapter5;

/**
 * @author tracy
 * 5-门面模式
 */
public class Client1 {
    public static void main(String[] args) {
        System.out.println("=====开始一门课程=====");
        new Check().handle();//考勤
        new Question().handle();//提问
        new Task().handle();//作业
        new Exam().handle();//考试
        System.out.println("=====结束一门课程=====");
    }
}

class Check{
    public void handle(){
        System.out.println("考勤......");
    }
}
class Question{
    public void handle(){
        System.out.println("提问......");
    }
}
class Task{
    public void handle(){
        System.out.println("交作业......");
    }
}
class Exam{
    public void handle(){
        System.out.println("期末考试......");
    }
}
