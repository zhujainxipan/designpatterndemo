package com.ht.delegate.demo2;

import com.ht.delegate.demo1.GamePlayer;
import com.ht.delegate.demo1.IGamePlayer;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);

        System.out.println("开始时间是:2016.03.26");

        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrate();

        System.out.println("结束时间是:2017.03.26");
    }
}
