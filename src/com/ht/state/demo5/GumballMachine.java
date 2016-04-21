package com.ht.state.demo5;

/**
 * Created by annuoaichengzhang on 16/4/21.
 */
/*
 *  糖果机器上下文环境接口类 GumballMachine
 */

public class GumballMachine {
    //状态实例
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    // 实例变量state，初始化为糖果售罄状态
    State state = soldOutState;
    // 记录机器内装有糖果的数目，开始机器是没有装糖果的
    int count=0;
    // 构造器取得糖果的初始数目并把它放在一个实例变量count中
    public GumballMachine(int numberGumballs) {
        // 每种状态都创建一个状态实例
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState=new HasQuarterState(this);
        soldState=new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        // 若超过0颗糖果，就将状态设置为NoQuarterState
        if(numberGumballs > 0) {
            state = noQuarterState;
        }
    }
    // 取得机器内的糖果数目
    public int getCount() {
        return count;
    }
    // 取得糖果售罄状态
    public State getSoldOutState() {
        return soldOutState;
    }
    // 取得没有25分钱状态
    public State getNoQuarterState() {
        return noQuarterState;
    }
    // 取得拥有25分钱
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    // 取得售出糖果状态
    public State getSoldState() {
        return soldState;
    }
    // 取得赢家状态
    public State getWinnerState() {
        return winnerState;
    }
    // 投入25分钱
    public void insertQuarter(){
        state.insertQuarter();
    }
    // 拒绝25分钱
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    // 转动曲柄
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    // 设置状态
    public void setState(State state){
        this.state=state;
    }
    // 糖果滚出来一个
    public void releaseBall(){
        System.out.println("A gumball comes rolling out of the solt...");
        if(count!=0){
            count--;
        }
    }
}
