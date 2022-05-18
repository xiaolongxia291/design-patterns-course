package com.wang.design.chapter0;

/**
 * @author Tracy
 *
 * 0-2 继承
 */
public abstract class Vehicle {
    /**
     * 以下为所有交通工具共有的属性
     */
    protected String category;//"交通工具"
    protected String size;//"大","中","小"
    protected String name;//具体的名字"飞机"、"轮船"等
    protected String load;//载重

    /**
     * 构造函数
     */
    public Vehicle(String size, String load,String name) {
        this.category = "交通工具";
        this.size = size;
        this.name = name;
        this.load=load;
    }

    public Vehicle() {
    }

    /**
     * setter & getter
     *
     */

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 以下为所有交通工具共有的方法
     */
    public abstract void show();

}
