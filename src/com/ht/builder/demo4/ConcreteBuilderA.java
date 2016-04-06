package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class ConcreteBuilderA extends AbstractBuilder{
    private AbstractProduct productA = new ConcreteProductA();
    @Override
    public void buildPart() {
        this.productA.part03();
        this.productA.part02();
        this.productA.part01();
    }

    @Override
    public AbstractProduct buildProduct() {
        return this.productA;
    }
}
