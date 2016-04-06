package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class ConcreteProductA extends AbstractProduct {
    @Override
    protected void part01() {
        System.out.println("产品A:part01()...");
    }

    @Override
    protected void part02() {
        System.out.println("产品A:part02()...");
    }

    @Override
    protected void part03() {
        System.out.println("产品A:part03()...");
    }
}
