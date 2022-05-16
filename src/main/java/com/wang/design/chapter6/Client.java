package com.wang.design.chapter6;

/**
 * @author tracy
 *
 * 6-组合模式
 */
public class Client {
    public static void main(String[] args) {
        Node root=new Node("root");

        Node branch1=new Node("branch1");
        Node branch2=new Node("branch2");

        Node leaf1=new Node("leaf1");
        Node leaf2=new Node("leaf2");
        Node leaf3=new Node("leaf3");
        Node leaf4=new Node("leaf4");

        root.addChild(branch1);
        root.addChild(branch2);
        root.addChild(leaf4);

        branch1.addChild(leaf1);
        branch1.addChild(leaf2);
        branch2.addChild(leaf3);

        root.show();
    }
}
