package com.ht.command.demo2;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class CommandChange implements Command {
    private Receiver receiver;
    private int channel;

    public CommandChange(Receiver receiver, int channel) {
        this.receiver = receiver;
        this.channel = channel;
    }

    @Override
    public void execute() {
        receiver.changeChannel(channel);
    }
}
