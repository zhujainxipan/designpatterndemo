package com.ht.hunbian.demo35;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public enum StrategyMan {
    SteadyDeduction("com.ht.demo35.SteadyDeduction"),
    FreeDeduction("com.ht.demo35.FreeDeduction");
    String value = "";

    private StrategyMan(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
