package com.ht.flyweight.demo1;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class SignInfoFactory {
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
