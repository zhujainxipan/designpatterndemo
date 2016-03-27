package com.ht.command.demo2;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class CommandOn implements Command {
    private Receiver receiver;

    public CommandOn(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }
}
