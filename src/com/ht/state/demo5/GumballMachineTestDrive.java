package com.ht.state.demo5;

/**
 * Created by annuoaichengzhang on 16/4/21.
 */
/*
 * 糖果机测试驱动程序：GumballMachineTestDrive.java
 */
public class GumballMachineTestDrive {

    /**
     * @param args
     */
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");


        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");
    }

}