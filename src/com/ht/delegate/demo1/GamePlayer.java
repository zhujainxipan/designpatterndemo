package com.ht.delegate.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登陆名为:" + user + "的用户" + this.name + "登陆成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪!");
    }

    @Override
    public void upgrate() {
        System.out.println(this.name + "又升了一级!");
    }
}
