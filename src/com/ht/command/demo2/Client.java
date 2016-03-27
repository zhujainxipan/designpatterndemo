package com.ht.command.demo2;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        CommandOn on = new CommandOn(receiver);
        CommandOff off = new CommandOff(receiver);
        CommandChange change = new CommandChange(receiver, 2);

        Invoker invoker = new Invoker(on, off, change);
        invoker.turnOn();

        invoker.changeChannel();

        invoker.turnOff();
    }
}
