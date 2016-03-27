package com.ht.observer.demo1;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();
        hanFeiZi.haveBreakfast();

        Spy spy = new Spy(hanFeiZi, liSi);
        spy.start();
    }
}
