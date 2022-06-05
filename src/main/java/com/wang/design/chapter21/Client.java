package com.wang.design.chapter21;

/**
 * @author tracy
 * 21-观察者模式
 */
public class Client {
    public static void main(String[] args) {
        Shop shop=new Shop("解忧杂货铺");
        Buyer handyBuyer=new HandicraftBuyer("手工艺品买手");
        Buyer phoneBuyer=new PhoneBuyer("手机买手");
        Buyer stationaryBuyer=new StatonaryBuyer("文具买手");

        //买家登记
        shop.register(handyBuyer);
        shop.register(phoneBuyer);
        shop.register(stationaryBuyer);

        //到货了
        shop.purchaseHandicraft("兵马俑摆件");
        shop.purchaseHandicraft("海螺捕梦网");
        shop.purchaseHandicraft("古风沙漏");
        shop.purchaseStationary("直尺");
        shop.purchaseStationary("书立");
        shop.purchaseStationary("订书机");
        shop.purchasePhone("华为荣耀20");
        shop.purchasePhone("华为荣耀20s");
    }
}
