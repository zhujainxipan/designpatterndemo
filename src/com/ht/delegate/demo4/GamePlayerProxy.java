package com.ht.delegate.demo4;


/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    // 通过参数传递要对谁进行代练
    public GamePlayerProxy(IGamePlayer player) {
       this.gamePlayer = player;
    }

    @Override
    public void login() {
        this.gamePlayer.login();
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrate() {
        this.gamePlayer.upgrate();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
