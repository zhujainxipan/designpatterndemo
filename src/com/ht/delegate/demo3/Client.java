package com.ht.delegate.demo3;

/**
 * Created by annuoaichengzhang on 16/4/7.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");

    }
}
