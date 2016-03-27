package com.ht.command.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
