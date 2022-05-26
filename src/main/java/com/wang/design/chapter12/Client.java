package com.wang.design.chapter12;

public class Client {
    public static void main(String[] args) {
        Course course=new Math();
        course.show();

        course=new English();
        course.show();
    }
}
