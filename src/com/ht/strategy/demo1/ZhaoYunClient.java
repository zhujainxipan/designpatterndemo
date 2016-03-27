package com.ht.strategy.demo1;

/**
 * Created by annuoaichengzhang on 16/3/24.
 */
public class ZhaoYunClient {
    public static void main(String[] args) {
        Context context;
        // 拆第一个锦囊
        context = new Context(new WuGuoTai());
        // 执行第一个锦囊
        context.operate();

        // 拆第二个锦囊
        context = new Context(new QaoGuoLao());
        // 执行第二个锦囊
        context.operate();

        // 拆第三个锦囊
        context = new Context(new SunFuRen());
        // 执行第三个锦囊
        context.operate();
    }
}
