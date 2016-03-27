package com.ht.hunbian.demo35;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class SteadyDeduction implements IDeduction {
    @Override
    public boolean exec(Card card, Trade trade) {
        int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}
