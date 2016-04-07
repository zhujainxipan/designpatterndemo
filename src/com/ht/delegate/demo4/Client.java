package com.ht.delegate.demo4;

/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三", "1122");
        System.out.println("开始时间是:2016.04.07");
        gamePlayer.login();
        gamePlayer.killBoss();
        gamePlayer.upgrate();
        System.out.println("结束时间是:2016.04.09");
    }
}
