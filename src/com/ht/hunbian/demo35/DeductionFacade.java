package com.ht.hunbian.demo35;

import java.util.Stack;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class DeductionFacade {

    public static Card deduct(Card card, Trade trade){
        StrategyMan reg = getDeductionType(trade);
        IDeduction deduction = StrategyFactory.getDeduction(reg);
        DeductionContext context = new DeductionContext(deduction);
        context.exec(card, trade);
        return card;

    }

    /**
     * 自己写的判断
     * @param trade
     * @return
     */
    private static StrategyMan getDeductionType(Trade trade) {
        if (trade.getTradeNo().contains("abc")) {
            return StrategyMan.FreeDeduction;
        } else {
            return StrategyMan.SteadyDeduction;
        }
    }
}
