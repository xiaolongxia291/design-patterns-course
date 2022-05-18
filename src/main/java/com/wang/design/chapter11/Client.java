package com.wang.design.chapter11;

/**
 * @author tracy
 *
 * 11-桥接模式
 */
public class Client {
    public static void main(String[] args) {
        Pen pen=new Pen(new Red(),new Sketch(),new Rect());
        pen.print();

        pen=new Pen(new Green(),new Water(),new Tri());
        pen.print();
    }
}
