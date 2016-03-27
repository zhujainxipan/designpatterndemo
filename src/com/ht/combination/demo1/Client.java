package com.ht.combination.demo1;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public class Client {
    public static void main(String[] args) {
        Root ceo = new Root("王大麻子", "总经理", 100000);
        IBranch developDep = new Branch("lisi", "研发部经理", 20000);
        IBranch salesDep = new Branch("wangwu", "销售部经理", 20000);

        IBranch firstZuZhang = new Branch("zuzhang1", "开发组长1", 5000);
        IBranch secondZuZhang = new Branch("zuzhang2", "开发组长2", 5000);

        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);

        ceo.add(developDep);
        ceo.add(salesDep);

        developDep.add(firstZuZhang);
        developDep.add(secondZuZhang);

        firstZuZhang.add(a);
        firstZuZhang.add(b);

        secondZuZhang.add(c);
        secondZuZhang.add(d);
    }
}
