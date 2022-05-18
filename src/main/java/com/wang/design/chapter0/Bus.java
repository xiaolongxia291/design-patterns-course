package com.wang.design.chapter0;

/**
 * @author Tracy
 *
 * 0-2 继承
 *
 * 继承自父类Vehicle
 */
public class Bus extends Vehicle {
    protected String route;//线路

    public Bus(String size,String load,String route) {
        super(size,load,"公交车");
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void show() {
        System.out.println(category+"："+size+""+name+"，线路为"+route+"路。");
    }

    public static void main(String[] args) {
        new Bus("中型","2t","220").show();
    }
}
