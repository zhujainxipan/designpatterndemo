package com.ht.observer.demo3;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Client {
    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.haveBreakfast();
    }
}
