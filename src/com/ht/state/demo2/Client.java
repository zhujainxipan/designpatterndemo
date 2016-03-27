package com.ht.state.demo2;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.CLOSING_STATE);

    }
}
