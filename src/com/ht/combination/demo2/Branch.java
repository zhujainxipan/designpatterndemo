package com.ht.combination.demo2;

import com.sun.scenario.effect.Effect;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Branch extends Corp {
    private ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinateList() {
        return this.subordinateList;
    }
}
