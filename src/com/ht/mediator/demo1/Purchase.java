package com.ht.mediator.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstraMediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不要采购IBM电脑");
    }
}
