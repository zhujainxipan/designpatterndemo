package com.ht.adapter.demo1;

import java.util.Map;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map<String, String> homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();


    @Override
    public String getUserName() {
        return this.homeInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        return null;
    }

    @Override
    public String getMobileNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
