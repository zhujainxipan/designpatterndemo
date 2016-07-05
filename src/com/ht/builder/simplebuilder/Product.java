package com.ht.builder.simplebuilder;

/**
 * Created by niehongtao on 16/7/4.
 */
public class Product {
    public String partA;
    public String partB;

    private Product(Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
    }


    public static class Builder {
        public String partA;
        public String partB;


        public Product.Builder buildPartA(String partA) {
            this.partA = partA;
            return this;
        }


        public Product.Builder buildPartB(String partB) {
            this.partB = partB;
            return this;
        }


        public Product build() {
            return new Product(this);
        }

    }


}
