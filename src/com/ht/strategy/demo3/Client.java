package com.ht.strategy.demo3;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String symbol = "+";
        Context context = null;

        if (symbol.equals("+")) {
            context = new Context(new Add());
        } else if (symbol.equals("-")) {
            context = new Context(new Sub());
        }

        System.out.println("运行结果为:...." + context.exec(a, b));
    }
}
