package com.ht.singleton;

/**
 * Created by annuoaichengzhang on 16/6/11.
 */
public class LazySingleton {
    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
