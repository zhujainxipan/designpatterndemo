package com.ht.state.demo4;

/**
 * Created by annuoaichengzhang on 16/4/21.
 * 案例:榨汁机:https://segmentfault.com/a/1190000003818435
 * 其实就跟head first设计模式之禅上的糖果机一样的
 */
public class MillMachine {
    State noMoneyState;
    State hasMoneyState;
    State soldState;
    State soldOutState;
    State state;
    int count;

    public MillMachine(int count){
//        noMoneyState = new NoMoneyState(this);
//        //.....
//        this.count = count;
//        if(count>0)
//            state = noMoneyState;
    }

    public void insertMoney(){
        state.insertMoney();
    }

    public void withdrawMoney(){
        state.withdrawMoney();
    }

    public void pressKnob(){
        state.pressKnob();
    }

    public void produce(){
        state.produce();
    }

    public void setState(State state){
        this.state = state;
    }


}