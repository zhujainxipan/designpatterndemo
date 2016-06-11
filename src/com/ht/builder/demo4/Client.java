package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("利用Director类获得不同组装方式的产品A");
        ConcreteBuilderA builderA = new ConcreteBuilderA();
        Director director = new Director(builderA);
        director.getProductA();
    }
}
