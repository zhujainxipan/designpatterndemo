package com.ht.builder.demo2;

import com.ht.builder.demo1.BenzModel;
import com.ht.builder.demo1.CarModel;

import java.util.ArrayList;

/**
 * Created by annuoaichengzhang on 16/3/22.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
