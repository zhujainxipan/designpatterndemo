package com.ht.command.demo2;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Invoker {
    private Command onCommand, offCommand, changeChannel;

    public Invoker(Command on, Command off, Command channel) {
        this.onCommand = on;
        this.offCommand = off;
        this.changeChannel = channel;
    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void changeChannel() {
        changeChannel.execute();
    }
}
