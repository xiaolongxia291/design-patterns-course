package com.wang.design.chapter2;

/**
 * @author Tracy
 *
 * 2-1 创建型——原型模式
 */
public class Passerby implements Cloneable{
    // x坐标和y坐标
    private int x;
    private int y;
    private Equipment equipment;

    public Passerby(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //行走
    public void walk(){
        ++y;
    }

    //奔跑
    public void run(){
        y+=5;
    }

    //重写克隆方法
    @Override
    protected Passerby clone() throws CloneNotSupportedException {
        Passerby passerby=(Passerby)super.clone();
        passerby.setEquipment(this.equipment.clone());//深拷贝
        return passerby;
    }
}

class Equipment implements Cloneable{
    @Override
    protected Equipment clone() throws CloneNotSupportedException {
        return (Equipment)super.clone();
    }
}
