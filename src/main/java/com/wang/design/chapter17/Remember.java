package com.wang.design.chapter17;

import java.util.LinkedList;

/**
 * @author tracy
 *
 * 17-备忘录模式
 */
public class Remember {
    private String title;
    private LinkedList<String> content;
    private LinkedList<LinkedList<String>> historyList;//最多备份5条

    public Remember(String title){
        this.title=title;
        this.content=new LinkedList<>();
        this.historyList=new LinkedList<>();
    }

    // 1以行为单位插入内容，每插入一行自动备份
    public void append(String row){
        System.out.println("添加:"+row);
        this.content.addLast(row);
        this.backup();
        this.show();
    }

    // 2以行为单位删除内容
    public void delete(){
        if(this.content.size()==0){
            System.out.println("内容为空，无法删除！");
            return;
        }
        System.out.println("删除:"+this.content.removeLast());
        this.show();
    }

    // 3一键清空内容
    public void clear(){
        this.content=new LinkedList<>();
        System.out.println("已清空内容");
        this.show();
    }

    // 4展示最新备份内容
    public void latestHistory(){
        System.out.println("正在获取最新备份内容:");
        if(this.historyList.size()==0){
            System.out.println("没有备份！");
            return;
        }
        for(String row:this.historyList.getLast()){
            System.out.println(row);
        }
        System.out.println();
    }

    // 5退回到最新备份内容
    public void recovery(){
        System.out.println("正在恢复...");
        this.content=this.historyList.getLast();
        System.out.println("备忘录恢复成功:");
        this.show();
    }

    // 私有方法：展示所有已输入内容
    private void show(){
        System.out.println("------<"+this.title+">------");
        if(this.content.size()==0) {
            System.out.println("null");
            System.out.println();
            return;
        }
        for(String row:this.content){
            System.out.println(row);
        }
        System.out.println();
    }

    // 私有方法：备份功能
    private void backup(){
        this.historyList.addLast(new LinkedList<>(this.content));
        if(this.historyList.size()==6)this.historyList.removeFirst();
    }
}
