package com.ht.builder.demo1;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class BMModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车在启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车在停止");

    }

    @Override
    protected void alarm() {
        System.out.println("宝马车在响铃");

    }
}
