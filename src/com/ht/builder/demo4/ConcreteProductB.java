package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class ConcreteProductB extends AbstractProduct {
    @Override
    protected void part01() {
        System.out.println("产品B:part01()...");
    }

    @Override
    protected void part02() {
        System.out.println("产品B:part02()...");
    }

    @Override
    protected void part03() {
        System.out.println("产品B:part03()...");
    }
}
