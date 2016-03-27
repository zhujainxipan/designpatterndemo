package com.ht.hunbian.demo35;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class StrategyFactory {
    public static IDeduction getDeduction(StrategyMan strategy) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(strategy.getValue()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deduction;
    }
}
