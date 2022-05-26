package com.wang.design.chapter18;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author tracy
 *
 * 18-中介模式
 */
public class User {
    private String name;
    private ChatRoom chatRoom;
    private ArrayList<String> msgBox;//接收消息的容器

    public User(String name){
        this.name=name;
        this.msgBox=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //加入聊天室
    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
        chatRoom.register(this);//在聊天室中登记注册用户信息
    }

    //发言
    public void talk(String words,User to){
        System.out.println(this.name+"正在发言...");
        //不指定用户，则默认为广播
        if(to==null){
            chatRoom.broadcast(this,words);
        }
        //指定向特定用户发送消息
        else chatRoom.toSomeone(this,to,words);
        System.out.println();
    }

    //接收消息
    public void receive(String msg){
        this.msgBox.add(msg);
    }

    //获取消息
    public void listen(){
        System.out.println("用户["+this.name+"]正在收听消息：");
        for (String str:this.msgBox){
            System.out.println(str);
        }
        System.out.println();
    }

    //判断两个用户是否为同一个
    @Override
    public boolean equals(Object obj) {
        if(obj==null||this.getClass()!=obj.getClass())return false;
        User u=(User)obj;
        return Objects.equals(this.name,u.getName());
    }
}
