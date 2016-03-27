package com.ht.strategy.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
