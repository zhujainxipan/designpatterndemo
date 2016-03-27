package com.ht.combination.demo2;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return "姓名:" + this.name + "\t职位:" + this.position + "\t薪资:" + this.salary;
    }
}
