package com.ht.delegate.demo6;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by annuoaichengzhang on 16/6/12.
 */
public class DAOLogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object object;

    public DAOLogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args);
        afterInvoke();
        return result;
    }

    private void afterInvoke() {
        System.out.println("方法调用结束");
    }

    private void beforeInvoke() {
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间:" + time);
    }
}
