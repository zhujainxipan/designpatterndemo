package com.ht.strategy.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class SunFuRen implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后,挡住追兵");
    }
}
