package com.wang.design.chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tracy
 * 4-建造者模式-建筑物类
 */
public class Building {
    private List<String> buildingComponents=new ArrayList<>();//组装组件

    public void setBasement(String basement){//修建地基
        buildingComponents.add(basement);
    }

    public void setWall(String wall){//修建墙体
        buildingComponents.add(wall);
    }

    public void setRoof(String roof){//修建屋顶
        buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        String str="";
        for(int i = buildingComponents.size()-1;i>=0;--i){
            str += buildingComponents.get(i);
        }
        return str;
    }

}
