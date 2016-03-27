package com.ht.decortor.demo3;

import com.ht.decortor.demo1.SchoolReport;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
