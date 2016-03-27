package com.ht.agency.demo1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Stock extends AbstractColleague{
    private int stockNumber = 100;

    public Stock(AbstraMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        stockNumber = stockNumber + number;
        System.out.println("库存数量为" + stockNumber);
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void decrease(int number) {
        stockNumber = stockNumber - number;
        System.out.println("库存数量为" + stockNumber);
    }


    public void clearStock() {
        System.out.println("清理库存数量为" + stockNumber);
        super.mediator.execute("stock.clear");
    }
}
