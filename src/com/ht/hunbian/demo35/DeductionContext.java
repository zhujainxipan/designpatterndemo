package com.ht.hunbian.demo35;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class DeductionContext {
    private IDeduction deduction = null;

    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }

    public boolean exec(Card card, Trade trade) {
        return this.deduction.exec(card, trade);
    }
}
