package com.ht.delegate.demo3;

/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    // 通过参数传递要对谁进行代练
    public GamePlayerProxy(String gamePlayerName, String passWord) {
        try {
            gamePlayer = new GamePlayer(gamePlayerName, passWord);
        } catch (Exception e) {
            // todo
        }
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
}
