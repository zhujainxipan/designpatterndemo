package com.ht.delegate.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by annuoaichengzhang on 16/5/13.
 */
public class GamePlayIH implements InvocationHandler {
    Class cls = null;
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
