package com.ht.state.demo5;

/**
 * Created by annuoaichengzhang on 16/4/21.
 * 糖果机的案例
 */
public interface State {
    public void insertQuarter();   // 投入25分钱
    public void ejectQuarter();    // 拒绝25分钱
    public void turnCrank();       // 转动曲柄
    public void dispense();        // 发放糖果
}
