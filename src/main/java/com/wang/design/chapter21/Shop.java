package com.wang.design.chapter21;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tracy
 * 21-观察者模式
 */
public class Shop {
    private String name;//商店名
    private List<String> handicraft,stationary,phone;//售卖种类：手工艺品、文具、手机
    private List<Buyer> buyers;//买家预定

    public Shop(String name){
        this.name=name;
        this.handicraft=new ArrayList<>();
        this.stationary=new ArrayList<>();
        this.phone=new ArrayList<>();
        buyers=new ArrayList<>();
        System.out.println(this.name+"开张了！");
    }

    public List<String> getHandicraft() {
        return handicraft;
    }
    public List<String> getStationary() {
        return stationary;
    }
    public List<String> getPhone() {
        return phone;
    }

    //商家登记
    public void register(Buyer buyer){
        this.buyers.add(buyer);
    }

    //进货
    public void purchaseHandicraft(String product){
        this.handicraft.add(product);
        notifyBuyers();
    }
    public void purchaseStationary(String product){
        this.stationary.add(product);
        notifyBuyers();
    }
    public void purchasePhone(String product){
        this.phone.add(product);
        notifyBuyers();
    }

    //通知买家
    public void notifyBuyers(){
        this.buyers.stream().forEach(b->b.inform(this));
    }
}
