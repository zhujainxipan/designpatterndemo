package com.ht.visitor.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public interface Vehicle {
    public void showPrice();
    public void accept(Vistor v);
}
