package com.ht.observer.demo2;


/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class HanFeiZi implements IHanFeiZi{
    private ILiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了");
        // 通知李斯
        this.liSi.update("韩非子在吃饭");
    }
}
