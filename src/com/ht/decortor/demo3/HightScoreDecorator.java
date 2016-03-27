package com.ht.decortor.demo3;

import com.ht.decortor.demo1.SchoolReport;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class HightScoreDecorator extends Decorator {
    public HightScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        this.reportHightScore();
        super.report();
    }

    private void reportHightScore() {
        System.out.println("这次语文最高是75,数学是78,自然是80");
    }
}
