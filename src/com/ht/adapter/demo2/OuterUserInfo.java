package com.ht.adapter.demo2;


/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class OuterUserInfo implements IUserInfo{
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
    }


    @Override
    public String getUserName() {
        return (String) this.baseInfo.getUserBaseInfo().get("userName");
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
