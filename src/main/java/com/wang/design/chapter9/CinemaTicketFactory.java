package com.wang.design.chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tracy
 * 9-享元模式
 */
public class CinemaTicketFactory {
    private static final Map<String,Ticket> cinema_pool = new HashMap<>();//缓冲池


    public static Ticket buyAndGetInfo(String name){
        //当缓冲池中不存在name电影对应的对象时，创建一个并放入池子里
        if(cinema_pool.get(name)==null){
            System.out.println("新建对象");
            cinema_pool.put(name,new CinemaTicket(name));
        }
        //获取需要的对象，而不必每次都重复new对象
        System.out.println("获取到了对象");
        return cinema_pool.get(name);
    }
}
