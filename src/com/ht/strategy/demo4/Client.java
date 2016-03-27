package com.ht.strategy.demo4;

import com.ht.strategy.demo3.Add;
import com.ht.strategy.demo3.Context;
import com.ht.strategy.demo3.Sub;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class Client {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String symbol = "+";

        System.out.println("运行结果为:...." + Calculator.ADD.exec(1, 2));
    }
}
