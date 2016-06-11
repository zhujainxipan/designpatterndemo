package com.ht.singleton;

/**
 * Created by annuoaichengzhang on 16/6/11.
 * 饿汉式单例
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
