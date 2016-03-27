package com.ht.builder.demo2;

import com.ht.builder.demo1.CarModel;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
