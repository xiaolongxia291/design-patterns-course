package com.wang.design.chapter10;

/**
 * @author tracy
 *
 * 10-代理模式-静态代理
 */
public class Client {
    public static void main(String[] args) {
        //静态代理
        //CinemaTicketAgent agent=new CinemaTicketAgent(new CinemaTicket());
        //agent.buyTicket("战狼","13:00","0712");

        //动态代理
        Ticket ticket=(Ticket) new CinemaTicketAgent().getAgent(new CinemaTicket());
        ticket.buyTicket("爸爸去哪儿","14:20","0806");
    }
}
