package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class ConcreteBuilderB extends AbstractBuilder {
    private AbstractProduct productB = new ConcreteProductB();
    @Override
    public void buildPart() {
        this.productB.part02();
        this.productB.part01();
        // part03功能顾客不需要
    }

    @Override
    public AbstractProduct buildProduct() {
        return this.productB;
    }
}
