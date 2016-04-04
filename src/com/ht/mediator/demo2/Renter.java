package com.ht.mediator.demo2;

/**
 * Created by annuoaichengzhang on 16/4/4.
 */
public class Renter extends Person {
    public Renter(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected void sendMessage(String msg) {
        super.mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println("求租者" + super.name + "收到中介发来的信息" + msg);
    }
}
