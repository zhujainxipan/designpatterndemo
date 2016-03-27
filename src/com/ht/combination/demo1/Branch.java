package com.ht.combination.demo1;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Branch implements IBranch {
    private ArrayList subordinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "名称:" + this.name + "\t职位:" + this.position + "\t薪水:" + this.salary;
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
