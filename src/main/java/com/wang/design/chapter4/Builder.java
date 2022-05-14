package com.wang.design.chapter4;

/**
 * @author tracy
 * 3-建造者模式-施工队
 */
public interface Builder {
    void buildBasement();
    void buildWall();
    void buildRoof();
    Building getBuilding();
}

/**
 * 别墅施工队
 */
class HouseBuilder implements Builder{
    private Building house;

    public HouseBuilder(){
        house=new Building();
    }

    /**
     * 施工三步曲
     */
    @Override
    public void buildBasement() {
        System.out.println("建造地基");
        house.setBasement("╬╬╬╬╬╬╬╬╬╬\n");
    }

    @Override
    public void buildWall() {
        System.out.println("建造墙体");
        house.setWall("｜田｜田 田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("建造屋顶");
        house.setRoof("╱◥███████◣\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}

/**
 * 公寓施工队
 */
class ApartmentBuilder implements Builder{
    private Building apartment;

    public ApartmentBuilder(){
        apartment=new Building();
    }

    /**
     * 施工三步曲
     */
    @Override
    public void buildBasement() {
        System.out.println("建造地基");
        apartment.setBasement("╚═════════╝\n");
    }

    @Override
    public void buildWall() {
        System.out.println("建造墙体");
        for (int i = 0; i < 8; i++) {// 8层
            apartment.setWall("║ □ □ □ □ ║\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("建造屋顶");
        apartment.setRoof("╔═════════╗\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}