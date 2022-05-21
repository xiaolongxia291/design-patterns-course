package com.wang.design.chapter7.chapter12;

/**
 * @author tracy
 *
 * 12-模板方法模式
 */
public class Client {
    public static void main(String[] args) {
        Course course=new Math();
        course.show();

        course=new English();
        course.show();
    }
}
