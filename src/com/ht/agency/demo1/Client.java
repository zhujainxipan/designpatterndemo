package com.ht.agency.demo1;

import java.nio.charset.StandardCharsets;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        AbstraMediator mediator = new Mediator();
        // 采购
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        // 销售
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        // 库房
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
