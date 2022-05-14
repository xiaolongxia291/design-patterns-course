package com.wang.design.chapter4;

/**
 * 4-建造者模式-工程监理
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 控制施工流程
     * @return
     */
    public Building direct(){
        System.out.println("=====工程项目启动=====");
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();
        System.out.println("=====工程项目竣工=====");
        return builder.getBuilding();
    }
}
