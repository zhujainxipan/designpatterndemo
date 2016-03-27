package com.ht.observer.demo4;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class HanFeiZi extends Observable {

    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了");
        // 通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }
}
