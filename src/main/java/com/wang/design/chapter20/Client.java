package com.wang.design.chapter20;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tracy
 * 20-访问者模式
 */

public class Client {
    public static void main(String[] args) {
        //一袋芒果干，单价15元
        //两斤苹果，单价5.2元
        //一瓶红酒，单价125元
        List<Acceptable> products= Arrays.asList(
                new DriedFruit("芒果干", LocalDate.of(2022,3,1),15.0f),
                new Fruit("苹果",LocalDate.of(2022,6,3),5.2f,2.0f),
                new Drink("红酒",LocalDate.of(2020,4,3),125.0f)
        );

        //批量结算
        Visitor discountVisitor=new DiscountVisitor(LocalDate.now());
        for(Acceptable product:products){
            product.accept(discountVisitor);
        }
    }
}
