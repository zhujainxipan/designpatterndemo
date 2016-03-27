package com.ht.state.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.open();

        lift.close();

        lift.run();

        lift.stop();
    }
}
