package com.ht.flyweight.demo2;

import com.ht.flyweight.demo1.SignInfo;

import javax.sound.midi.SysexMessage;
import java.util.HashMap;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;

        if (!pool.containsKey(key)) {
            System.out.println(key + "建立对象,并放置在池中");
            result = new SignInfo4Poll(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "直接从池中取得");
        }
        return result;
    }
}
