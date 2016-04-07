package com.ht.delegate.demo4;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public interface IGamePlayer {
    public void login();
    public void killBoss();
    public void upgrate();
    public IGamePlayer getProxy();
}
