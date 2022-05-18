package com.wang.design.chapter10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tracy
 *
 * 10-代理模式-静态代理
 */
public interface Ticket {
    void buyTicket(String name,String time,String seat);
}

class CinemaTicket implements Ticket{
    @Override
    public void buyTicket(String name,String time,String seat){
        System.out.println(name+" 时间:"+time+" 座位:"+seat);
    }
}
//静态代理类实现
//class CinemaTicketAgent implements Ticket{
//    private CinemaTicket cinemaTicket;
//    public CinemaTicketAgent(CinemaTicket cinemaTicket){
//        this.cinemaTicket=cinemaTicket;
//    }
//    @Override
//    public void buyTicket(String name,String time,String seat){
//        before();
//        this.cinemaTicket.buyTicket(name,time,seat);
//        after();
//    }
//    public void before(){
//        System.out.println("-----选座位-----");
//    }
//    public void after(){
//        System.out.println("-----付款-----");
//    }
//}

//动态代理类实现
class CinemaTicketAgent implements InvocationHandler{
    private Object target;//被代理对象

    //根据注入的被代理对象获取代理对象
    public Object getAgent(Object target){
        this.target=target;
        Class<?> targetClass=target.getClass();
        //创建并返回代理对象
        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }

    //调用代理对象方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj=method.invoke(this.target,args);
        after();
        return obj;
    }

    public void before(){
        System.out.println("-----选座位-----");
    }
    public void after(){
        System.out.println("-----付款-----");
    }
}