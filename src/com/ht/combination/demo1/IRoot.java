package com.ht.combination.demo1;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/25.
 */
public interface IRoot {
    public String getInfo();

    public void add(IBranch branch);

    public void add(ILeaf leaf);

    public ArrayList getSubordinateInfo();
}
