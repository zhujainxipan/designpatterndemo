package com.ht.flyweight.demo2;

import com.ht.flyweight.demo1.SignInfo;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;

            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点";
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
