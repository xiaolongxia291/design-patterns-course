package com.wang.design.chapter12;

public abstract class Course {
    abstract void register();//选课
    abstract void homework();//做作业
    abstract void exam();//考试

    public void show(){//通用方法
        this.register();
        this.homework();
        this.exam();
    }
}

class Math extends Course{
    @Override
    void register() {
        System.out.println("=====数学课开课了=====");
    }

    @Override
    void homework() {
        System.out.println("=====完成数学课平时=====");
    }

    @Override
    void exam() {
        System.out.println("=====进行数学期末考试=====");
    }
}

class English extends Course{
    @Override
    void register() {
        System.out.println("=====英语课开课了=====");
    }

    @Override
    void homework() {
        System.out.println("=====完成英语课平时=====");
    }

    @Override
    void exam() {
        System.out.println("=====进行英语期末考试=====");
    }
}
