package com.ht.combination.demo1;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Leaf implements ILeaf {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "名称" + this.name + "\t职位:" + this.position + "\t薪资:" + this.salary;
    }
}
