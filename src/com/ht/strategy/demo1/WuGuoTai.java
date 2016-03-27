package com.ht.strategy.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class WuGuoTai implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行");
    }
}
