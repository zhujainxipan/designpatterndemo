package com.ht.strategy.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }
}
