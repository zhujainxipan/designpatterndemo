package com.ht.state.demo5;

import java.util.Random;

/**
 * Created by annuoaichengzhang on 16/4/21.
 */
/*
 * 有25分钱状态，实现了State接口
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis()); //首先我们增加一个随机数产生器，产生10%赢的机
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    // 投入25分钱
    public void insertQuarter() {
        System.out.println("You can not insert anther quarter");
    }
    // 拒绝25分钱
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    // 转动曲柄
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        System.out.println("winner =" + winner);
        if((winner ==0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    // 发放糖果
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
