package com.ht.delegate.demo2;

import com.ht.delegate.demo1.IGamePlayer;
import sun.dc.pr.PRError;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();

    }

    @Override
    public void upgrate() {
        this.gamePlayer.upgrate();

    }
}
