package com.ht.decortor.demo2;

import com.ht.decortor.demo1.SchoolReport;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("老爸");
    }
}
