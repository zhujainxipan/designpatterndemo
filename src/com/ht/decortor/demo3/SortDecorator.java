package com.ht.decortor.demo3;

import com.ht.decortor.demo1.SchoolReport;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我的排名第38名.....");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
