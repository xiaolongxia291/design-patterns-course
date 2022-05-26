package com.wang.design.chapter18;

/**
 * @author tracy
 *
 * 18-中介模式
 */
public class Client {
    public static void main(String[] args) {
        //创建三个用户
        User user1=new User("小明");
        User user2=new User("小花");
        User user3=new User("团团");

        //创建聊天室
        ChatRoom chatRoom=new ChatRoom("卷王交流群");

        //用户加入聊天室
        user1.setChatRoom(chatRoom);
        user2.setChatRoom(chatRoom);
        user3.setChatRoom(chatRoom);

        //用户发言
        user1.talk("你们做作业了吗",null);
        user1.talk("帮我签一下到",user2);//私聊
        user3.talk("后天考试",null);

        //用户收听消息
        user1.listen();
        user2.listen();
        user3.listen();
    }
}
