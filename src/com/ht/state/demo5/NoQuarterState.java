package com.ht.state.demo5;

/**
 * Created by annuoaichengzhang on 16/4/21.
 */
/*
 * 没有25分钱状态，实现了State接口
 */

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    // 投入25分钱
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    // 拒绝25分钱
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }
    // 转动曲柄
    public void turnCrank() {
        System.out.println("You turned crank,but you there's no quarter");
    }
    // 发放糖果
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
