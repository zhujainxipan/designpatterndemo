package com.ht.builder.simplebuilder;

/**
 * Created by niehongtao on 16/7/4.
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Product.Builder().buildPartA("aaaa")
                .buildPartB("bbbb")
                .build();
        System.out.print(product.partA + "::" + product.partB);
    }
}
