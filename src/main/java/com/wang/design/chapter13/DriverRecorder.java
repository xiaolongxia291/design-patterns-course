package com.wang.design.chapter13;

import java.util.Iterator;

/**
 * @author tracy
 *
 * 13-迭代器模式
 */
public class DriverRecorder implements Iterable<String>{
    private String[] records=new String[10];//最多存储10条记录
    private int index=-1;//记录最新一条记录存放的位置

    //插入一条记录
    public void append(String record){
        if(index==9){//records满了，覆盖第一条
            index=0;
        }else{
            ++index;
        }
        records[index]=record;
    }

    //获取迭代器
    @Override
    public Iterator<String> iterator(){
        return new Itr();
    }

    private class Itr implements Iterator<String>{
        int loopCount=0;//用来遍历计数
        int cursor=index;//用来记录遍历位置

        @Override
        public boolean hasNext() {
            return loopCount<10;
        }

        //按最新插入的顺序遍历元素
        @Override
        public String next() {
            int i=cursor;//用来记录需要返回的元素的位置
            if(cursor==0)cursor=9;
            else --cursor;
            ++loopCount;
            return records[i];
        }
    }
}
