package com.ht.delegate.demo5;


/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String passWord) {
        System.out.println("用户" + this.name + "登陆成功");
    }

    @Override
    public void killBoss() {

        System.out.println("在打怪");

    }

    @Override
    public void upgrate() {

        System.out.println("有升了一级");

    }

}
