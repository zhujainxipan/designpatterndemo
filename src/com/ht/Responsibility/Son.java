package com.ht.Responsibility;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("儿子处理了请求");
    }
}
