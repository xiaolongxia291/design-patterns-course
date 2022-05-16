package com.wang.design.chapter6;

import java.util.*;

/**
 * @author tracy
 *
 * 6-组合模式
 */
public class Node {
    private final List<Node> children=new ArrayList<>();
    private int level=0;
    private String name;

    public Node(String name){
        this.name=name;
    }

    public void setLevel(int level){
        this.level=level;
    }

    public void addChild(Node child){
        child.setLevel(this.level+1);
        this.children.add(child);
    }

    public void show(){
        System.out.println(this.name);
        if(this.children.size()==0)return;
        for(Node node:children){
            for(int i=0;i<=this.level;++i) System.out.print(" ");
            System.out.print("|_");
            for(int i=0;i<this.level;++i) System.out.print("_");
            node.show();
        }
    }
}
