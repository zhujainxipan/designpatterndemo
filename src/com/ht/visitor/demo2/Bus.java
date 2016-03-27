package com.ht.visitor.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Bus implements Vehicle {
    @Override
    public void showPrice() {
        System.out.println("汽车当前票价为80元");
    }

    @Override
    public void accept(Vistor v) {
        v.visit(this);
    }
}
