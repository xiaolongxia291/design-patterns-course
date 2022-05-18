package com.wang.design.chapter0;

/**
 * @author Tracy
 *
 * 0-1 封装
 */
public class GrassJelly {
    //属性
    private String milkTea;
    private String material;

    //实例化对象
    public GrassJelly(String milkTea, String material) {
        this.milkTea = milkTea;
        this.material = material;
    }
    public GrassJelly(){

    }

    //访问属性
    public String getMilkTea() {
        return milkTea;
    }
    public String getMaterial() {
        return material;
    }
    public void show(){
        System.out.println("this is a cup of grass jelly.");
    }

    //修改属性
    public void setMilkTea(String milkTea) {
        this.milkTea = milkTea;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}
