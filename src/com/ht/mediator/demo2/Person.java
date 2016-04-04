package com.ht.mediator.demo2;

/**
 * Created by annuoaichengzhang on 16/4/4.
 * 求租者-房屋出租中介-房东
 */
public abstract class Person {
    protected Mediator mediator;
    protected String name;

    public Person(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void sendMessage(String msg);

    protected abstract void getMessage(String msg);
}
