package com.wang.design.chapter0.jicheng2;

/**
 * @author Tracy
 *
 * 0-2 继承
 *
 * 继承自父类Vehicle
 */
public class Airplane extends Vehicle {
    protected String flightNumber;//专属属性：航班号

    public Airplane(String size,String load,String flightNumber) {
        super(size,load,"飞机");
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void show() {
        System.out.println(category+"："+size+""+name+"，航班号为"+flightNumber+"。");
    }

    public static void main(String[] args) {
        new Airplane("大型","250t","12345").show();
    }
}
