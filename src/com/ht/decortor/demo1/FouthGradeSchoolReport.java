package com.ht.decortor.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的xxx家长:");
        System.out.println("语文62,数学65,自然60,体育98");
        System.out.println("...........:");
        System.out.println("家长签名:       ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名:" + name);
    }
}
