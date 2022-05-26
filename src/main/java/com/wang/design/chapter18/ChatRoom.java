package com.wang.design.chapter18;

import java.util.HashMap;

/**
 * @author tracy
 *
 * 18-中介模式
 */
public class ChatRoom {
    private String name;//群聊名称
    private HashMap<String,User> members;//群聊成员

    public ChatRoom(String name){
        this.name=name;
        members=new HashMap<>();
        System.out.println("聊天群["+this.name+"]已创建成功");
        System.out.println();
    }

    //新成员加入
    public void register(User user){
        members.put(user.getName(),user);
        System.out.println("用户["+user.getName()+"]加入聊天群");
        System.out.println();
    }

    //广播消息
    public void broadcast(User from,String words){
        if(this.members.size()!=0){
            for(User user:this.members.values()){
                user.receive(from.getName()+":"+words);
            }
        }
    }

    //给特定用户发消息
    public void toSomeone(User from,User to,String words){
        if(to.equals(this.members.getOrDefault(to.getName(),null))){
            to.receive(from.getName()+"(私):"+words);
        }
    }
}
