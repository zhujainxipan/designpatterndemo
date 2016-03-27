package com.ht.adapter.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", "这个员工叫混世魔王...");
        map.put("mobileNumber", "这个员工电话是...");
        return map;
    }
}
