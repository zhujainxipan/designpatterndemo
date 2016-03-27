package com.ht.observer.demo3;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子在活动");
    }
}
