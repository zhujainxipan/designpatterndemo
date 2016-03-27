package com.ht.adapter.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class OuterUser implements IOuterUser {

    /**
     * 员工的基本信息
     * @return
     */
    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", "这个员工叫混世魔王...");
        map.put("mobileNumber", "这个员工电话是...");
        return map;
    }

    /**
     * 员工的工作信息
     * @return
     */
    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("jobPosition", "这个员工的职位是...");
        map.put("officeTelNumber", "这个员工的办公电话是...");
        return map;
    }

    /**
     * 员工的家庭信息
     * @return
     */
    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("homeTelNumber", "这个员工的家庭电话是...");
        map.put("homeAdress", "这个员工的家庭住址是...");
        return map;
    }
}
