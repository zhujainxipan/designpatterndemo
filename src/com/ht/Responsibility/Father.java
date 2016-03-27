package com.ht.Responsibility;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("父亲答复");
    }
}
