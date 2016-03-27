package com.ht.builder.demo2;

import com.ht.builder.demo1.BMModel;
import com.ht.builder.demo1.CarModel;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class BMBuilder extends CarBuilder {
    private BMModel bmModel = new BMModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmModel;
    }
}
