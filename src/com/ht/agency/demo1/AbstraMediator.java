package com.ht.agency.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public abstract class AbstraMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstraMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objects);



}
