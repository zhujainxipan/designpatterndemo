package com.ht.delegate.demo3;

/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    private String passWord;

    public GamePlayer(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    @Override
    public void login() {

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
