package com.ht.adapter.demo1;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("这是员工的姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这是员工的姓名");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这是员工的手机号码");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这是员工的办公室电话号码");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这是员工的职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这是员工的家庭电话");
        return null;
    }
}
