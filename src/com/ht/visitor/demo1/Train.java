package com.ht.visitor.demo1;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Train implements Vehicle {
    @Override
    public void showPrice() {
        System.out.println("火车当前票价为50元");

    }

    @Override
    public void priceChange() {
        System.out.println("过年高峰期,在原有基础上调10%");
    }
}
