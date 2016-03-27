package com.ht.visitor.demo2;

/**
 * Created by annuoaichengzhang on 16/3/23.
 */
public interface Vistor {
    public void visit(Vehicle v);

    public void visit(Bus b);

    public void visit(Train t);

}
