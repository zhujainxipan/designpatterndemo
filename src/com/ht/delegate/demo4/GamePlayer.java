package com.ht.delegate.demo4;


/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    private String passWord;
    private IGamePlayer proxy = null;

    public GamePlayer(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    @Override
    public void login() {
        if (this.isProxy()) {
            System.out.println("用户" + this.name + "登陆成功");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println("在打怪");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrate() {
        if (this.isProxy()) {
            System.out.println("有升了一级");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this.name, this.passWord);
        return this.proxy;
    }

    public boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
