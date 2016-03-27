package com.ht.observer.demo3;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王思:韩非子在行动");
    }
}
