package com.ht.observer.demo1;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class Spy extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;

    public Spy(HanFeiZi hanFeiZi, LiSi liSi) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
    }


    @Override
    public void run() {
        while (true) {
            if (this.hanFeiZi.isHavingBreakfast()) {
                this.liSi.update("韩非子在吃饭");
                this.hanFeiZi.setHavingBreakfast(false);
            }
        }
    }
}
