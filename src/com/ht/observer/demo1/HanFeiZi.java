package com.ht.observer.demo1;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class HanFeiZi implements IHanFeiZi {
    private boolean isHavingBreakfast = false;


    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了");
        this.isHavingBreakfast = true;
    }


    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

}
