package com.ht.hunbian.demo35;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class FreeDeduction implements IDeduction {
    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
