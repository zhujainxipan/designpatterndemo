package com.ht.observer.demo1;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class LiSi implements ILiSi {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子开始活动了");
    }
}
