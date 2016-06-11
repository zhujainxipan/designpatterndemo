package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class Director {
    private AbstractBuilder builderA;

    public Director(AbstractBuilder builderA) {
        this.builderA = builderA;
    }

    public Product getProductA() {
        this.builderA.buildPartA();
        this.builderA.buildPartB();
        this.builderA.buildPartC();
        return this.builderA.getProduct();
    }

}
