package com.ht.strategy.demo3;

import com.ht.strategy.demo2.*;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
