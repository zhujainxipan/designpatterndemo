package com.ht.command.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command addRequirementCommand = new AddRequirementCommand();
        invoker.setCommand(addRequirementCommand);
        invoker.action();
    }
}
