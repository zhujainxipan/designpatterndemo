package com.ht.state.demo5;

/**
 * Created by annuoaichengzhang on 16/4/21.
 */
/*
 * 通过售罄状态，实现了State接口
 */
public class SoldOutState implements State{

    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }
    // 投入25分钱
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }
    // 拒绝25分钱
    public void ejectQuarter() {
        // TODO Auto-generated method stub
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }
    // 转动曲柄
    public void turnCrank() {
        // TODO Auto-generated method stub
        System.out.println("You turned, but there are no gumballs");
    }
    // 发放糖果
    public void dispense() {
        // TODO Auto-generated method stub
        System.out.println("No gumball dispensed");
    }
}