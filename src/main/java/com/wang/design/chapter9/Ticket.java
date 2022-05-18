package com.wang.design.chapter9;

/**
 * @author tracy
 * 9-享元模式
 */
public interface Ticket {
    void info();//获取电影票信息
    void setSeat(String seatType);//设置电影票座位等级：普通座、舒适座、豪华座
}

class CinemaTicket implements Ticket{
    private String name;//电影名称
    private String seatType="普通座";//座位等级，默认为普通座

    // 1 实例化
    public CinemaTicket(String name){
        this.name=name;
    }

    // 2 设置座位等级
    @Override
    public void setSeat(String seatType) {
        this.seatType=seatType;
    }

    // 3 获得票价
    public double getPrice(){
        switch (this.seatType){
            case "普通座":return 30.0;
            case "舒适座":return 40.0;
            default:return 50.0;//豪华座
        }
    }

    // 4 获得所有电影票相关信息
    @Override
    public void info() {
        System.out.println("当前影厅正在放映："+this.name+"，您购买的是："+this.seatType+"，票价为："+this.getPrice()+"元。");
    }
}
