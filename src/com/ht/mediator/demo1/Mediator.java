package com.ht.mediator.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Mediator extends AbstraMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void offSell() {
        System.out.println("折价销售电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        // 要求清仓销售
        super.sale.offsale();
        // 要求采购人员不要采购
        super.purchase.refuseBuyIBM();

    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            // 库存数量不够销售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);

    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {// 销售状况良好
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        } else {
            // 销售情况不好
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑:" + buyNumber + "台");
        }

    }
}
