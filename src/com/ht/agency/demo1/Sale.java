package com.ht.agency.demo1;

import java.util.Random;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Sale extends AbstractColleague{

    public Sale(AbstraMediator mediator) {
        super(mediator);
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("ibm电脑销售情况为:" + saleStatus);
        return saleStatus;
    }

    public void offsale() {
        super.mediator.execute("sale.offsell");
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售ibm电脑" + number);
    }
}
