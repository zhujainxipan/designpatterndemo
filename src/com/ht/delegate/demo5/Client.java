package com.ht.delegate.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by annuoaichengzhang on 16/5/13.
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        System.out.println("开始时间是:2016-05-13 09:37:40");

        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);

        proxy.login("zhangsan", "password");

        proxy.killBoss();

        proxy.upgrate();

        System.out.println("结束时间是:2016-05-13 09:52:26");

    }

}
