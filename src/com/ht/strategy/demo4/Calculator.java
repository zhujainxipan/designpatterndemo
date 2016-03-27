package com.ht.strategy.demo4;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public enum Calculator {
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },

    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
