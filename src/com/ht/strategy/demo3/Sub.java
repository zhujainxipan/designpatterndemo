package com.ht.strategy.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
