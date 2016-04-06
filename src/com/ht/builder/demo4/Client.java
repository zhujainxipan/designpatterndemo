package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("利用Director类获得不同组装方式的产品A");
        Director director = new Director();
        director.getProductA();
        System.out.println("利用Director类获得不同组装方式的产品B");
        director.getProductB();
    }
}
