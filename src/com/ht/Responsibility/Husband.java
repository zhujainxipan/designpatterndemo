package com.ht.Responsibility;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Husband extends Handler{

    public Husband() {
        super(Handler.HUSRAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("丈夫处理了请求");
    }
}
