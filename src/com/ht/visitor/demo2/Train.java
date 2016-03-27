package com.ht.visitor.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Train implements Vehicle {
    @Override
    public void showPrice() {
        System.out.println("火车当前的票价为50元");
    }

    @Override
    public void accept(Vistor v) {
        v.visit(this);
    }
}
