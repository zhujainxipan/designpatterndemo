package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class Director {
    private AbstractBuilder builderA = new ConcreteBuilderA();
    private AbstractBuilder builderB = new ConcreteBuilderB();

    public AbstractProduct getProductA() {
        this.builderA.buildPart();
        return this.builderA.buildProduct();
    }

    public AbstractProduct getProductB() {
        this.builderB.buildPart();
        return this.builderB.buildProduct();
    }

}
