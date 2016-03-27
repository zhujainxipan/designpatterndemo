package com.ht.visitor.demo1;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Client {
    public static void main(String[] args) {
        Vehicle v = new Bus();
        v.showPrice();
        v.priceChange();
        System.out.println("--------------------------");

        v = new Train();
        v.showPrice();
        v.priceChange();
    }
}
