package com.ht.delegate.demo3;

/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class Client {
    public static void main(String[] args) {
        // 我们找一个游戏代理,首先需要做的就是把用户名和密码告诉游戏代练
        IGamePlayer proxy = new GamePlayerProxy("张三", "1122");
        System.out.println("开始时间是:2016.04.07");
        proxy.login();
        proxy.killBoss();
        proxy.upgrate();
        System.out.println("结束时间是:2016.04.09");
    }
}
