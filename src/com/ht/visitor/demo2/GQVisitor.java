package com.ht.visitor.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class GQVisitor implements Vistor {
    @Override
    public void visit(Vehicle v) {

    }

    @Override
    public void visit(Bus b) {
        b.showPrice();
        System.out.println("国庆节期间汽车价格上涨5%");
    }

    @Override
    public void visit(Train t) {
        t.showPrice();
        System.out.println("国庆节期间价格上涨3%");
    }
}
