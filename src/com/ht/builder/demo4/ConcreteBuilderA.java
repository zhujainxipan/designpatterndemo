package com.ht.builder.demo4;

/**
 * Created by annuoaichengzhang on 16/4/6.
 */
public class ConcreteBuilderA extends AbstractBuilder{
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B");
    }

    @Override
    public void buildPartC() {
        product.setPartA("C");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
