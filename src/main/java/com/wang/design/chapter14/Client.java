package com.wang.design.chapter14;

/**
 * @author tracy
 *
 * 14-责任链模式
 */
public class Client {
    public static void main(String[] args) {
        Staff staff=new Staff("小王");
        Manager manager=new Manager("张冬良");
        CFO cfo=new CFO("程哥");

        staff.setHigherApprover(manager);
        manager.setHigherApprover(cfo);

        staff.approve(600);
        staff.approve(1200);
        staff.approve(6700);
        staff.approve(10020);
    }
}
