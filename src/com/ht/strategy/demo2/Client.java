package com.ht.strategy.demo2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        String symbol = "+";

        Calculator calculator = new Calculator();
        System.out.println("运行结果为: a + b = " + calculator.exec(a, b, symbol));
    }

}
