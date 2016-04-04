package com.ht.mediator.demo2;

/**
 * Created by annuoaichengzhang on 16/4/4.
 */
public class LandLord extends Person {
    public LandLord(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected void sendMessage(String msg) {
        mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println("房东" + super.name + "收到中介发来的消息:" + msg);
    }
}
