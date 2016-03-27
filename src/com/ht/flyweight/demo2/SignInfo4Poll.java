package com.ht.flyweight.demo2;

import com.ht.flyweight.demo1.SignInfo;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class SignInfo4Poll extends SignInfo {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SignInfo4Poll(String key) {
        this.key = key;
    }
}
