package com.ht.state.demo4;

/**
 * Created by annuoaichengzhang on 16/4/21.
 */
public class HasMoneyState implements State{

    MillMachine machine;

    public HasMoneyState(MillMachine machine){
        this.machine = machine;
    }

    public void insertMoney(){
        //.......
    }

    public void withdrawMoney(){
        System.out.println("you will get your money");
        machine.setState(machine.noMoneyState);
    }

    public void pressKnob(){
        //......
    }

    public void produce(){
        //......
    }

}