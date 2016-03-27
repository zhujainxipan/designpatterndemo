package com.ht.delegate.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("zhangsan");

        System.out.println("开始时间是:2016.03.26");

        gamePlayer.login("zhangsan", "password");

        gamePlayer.killBoss();

        gamePlayer.upgrate();

        System.out.println("结束时间是:2017.03.26");
    }
}
