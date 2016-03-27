package com.ht.decortor.demo3;

import com.ht.decortor.demo1.FouthGradeSchoolReport;
import com.ht.decortor.demo1.SchoolReport;

/**
 * Created by annuoaichengzhang on 16/3/26.
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport sr = null;

        sr = new FouthGradeSchoolReport();
        sr = new HightScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();
        sr.sign("老爸");

    }
}
