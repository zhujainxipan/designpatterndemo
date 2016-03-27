package com.ht.memo.demo2;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
