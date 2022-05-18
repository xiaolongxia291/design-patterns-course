package com.wang.design.chapter9;

/**
 * @author tracy
 * 9-享元模式
 */
public class Client {
    public static void main(String[] args) {
        //买一张票
        System.out.println("-----买票-----");
        Ticket ticket=CinemaTicketFactory.buyAndGetInfo("战狼");
        ticket.setSeat("普通座");
        ticket.info();
        //再买一张票
        System.out.println("-----买票-----");
        ticket=CinemaTicketFactory.buyAndGetInfo("战狼");
        ticket.setSeat("舒适座");
        ticket.info();
        //再买一张票
        System.out.println("-----买票-----");
        ticket=CinemaTicketFactory.buyAndGetInfo("四大名捕");
        ticket.setSeat("豪华座");
        ticket.info();
    }
}
